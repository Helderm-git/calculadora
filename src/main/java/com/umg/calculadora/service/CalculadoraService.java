package com.umg.calculadora.service;

import com.umg.calculadora.model.Operacion;
import com.umg.calculadora.repository.OperacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CalculadoraService {

    @Autowired
    private OperacionRepository operacionRepository;

    public double sumar(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        operacionRepository.save(new Operacion("Suma", numero1, numero2, resultado, LocalDateTime.now()));
        return resultado;
    }

    public double restar(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        operacionRepository.save(new Operacion("Resta", numero1, numero2, resultado, LocalDateTime.now()));
        return resultado;
    }

    public double multiplicar(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        operacionRepository.save(new Operacion("Multiplicación", numero1, numero2, resultado, LocalDateTime.now()));
        return resultado;
    }

    public double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        double resultado = numero1 / numero2;
        operacionRepository.save(new Operacion("División", numero1, numero2, resultado, LocalDateTime.now()));
        return resultado;
    }

    public List<Operacion> obtenerHistorial() {
        return operacionRepository.findAllOperations();
    }
}
