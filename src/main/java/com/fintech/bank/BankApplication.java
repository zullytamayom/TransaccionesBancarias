package com.fintech.bank;

import com.fintech.bank.model.Cuenta;
import com.fintech.bank.repository.CuentaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);


	}
    @Bean
    CommandLineRunner initDatabase(CuentaRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                Cuenta c1 = new Cuenta();
                c1.setNumeroCuenta("111");
                c1.setSaldo(new BigDecimal("1000"));
                c1.setTitular("Zully");

                Cuenta c2 = new Cuenta();
                c2.setNumeroCuenta("222");
                c2.setSaldo(new BigDecimal("50000"));
                c2.setTitular("Inetum");

                repository.save(c1);
                repository.save(c2);
                System.out.println("✅ Datos de prueba cargados en Oracle");
            }
        };
    }

}
