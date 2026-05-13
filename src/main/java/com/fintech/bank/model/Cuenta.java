package com.fintech.bank.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.math.BigDecimal;

@Entity
@Table(name = "CUENTAS")
@Data
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="NUMERO_CUENTA",unique = true)
    private String numeroCuenta;

    private BigDecimal saldo;
    private String titular;

}
