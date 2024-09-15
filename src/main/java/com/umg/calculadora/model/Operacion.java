package com.umg.calculadora.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Operacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoOperacion;
    private double numero1;
    private double numero2;
    private double resultado;
    private LocalDateTime fechaOperacion;

    public Operacion() {
    }

    public Operacion(String tipoOperacion, double numero1, double numero2, double resultado, LocalDateTime fechaOp) {
        this.tipoOperacion = tipoOperacion;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
        this.fechaOperacion = fechaOp;
    }

    public Operacion(Long id, String tipoOperacion, double numero1, double numero2, double resultado, LocalDateTime fechaOp) {
        this.id = id;
        this.tipoOperacion = tipoOperacion;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
        this.fechaOperacion = fechaOp;
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public String getOperacion() {
        return tipoOperacion;
    }

    public void setOperacion(String operacion) {
        this.tipoOperacion = operacion;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
}
