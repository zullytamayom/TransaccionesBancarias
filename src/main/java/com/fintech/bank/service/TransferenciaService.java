package com.fintech.bank.service;

import com.fintech.bank.model.Cuenta;
import com.fintech.bank.repository.CuentaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransferenciaService {

    private final CuentaRepository cuentaRepository;
    public TransferenciaService(CuentaRepository cuentaRepository){
        this.cuentaRepository = cuentaRepository;
    }

    @Transactional
    public void transferir(String cuentaOrigen, String cuentaDestino, BigDecimal monto){

        Cuenta origen = cuentaRepository.findByNumeroCuenta(cuentaOrigen)
                .orElseThrow(()-> new RuntimeException("La cuenta de origen no existe"));
        System.out.println("💰 Saldo origen antes: " + origen.getSaldo());

        Cuenta destino = cuentaRepository.findByNumeroCuenta(cuentaDestino)
                .orElseThrow(()-> new RuntimeException("Cuenta destino no existe"));
        System.out.println("💰 Saldo destino antes: " + destino.getSaldo());

        if(origen.getSaldo().compareTo(monto)<0){
            System.out.println("❌ ERROR: Saldo insuficiente");
            throw new RuntimeException("Saldo insuficiente en la cuenta de origen");
        }

        origen.setSaldo(origen.getSaldo().subtract(monto));
        destino.setSaldo(destino.getSaldo().add(monto));

        System.out.println("✅ Nuevos saldos calculados. Guardando...");
        cuentaRepository.save(origen);
        cuentaRepository.save(destino);
        System.out.println("🏁 Proceso terminado en el servicio");



    }

}
