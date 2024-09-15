package com.umg.calculadora.controller;

import com.umg.calculadora.model.Operacion;
import com.umg.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calculadora")
@CrossOrigin(origins = "http://localhost:3000") // Permitir solicitudes desde el frontend
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/sumar")
    public double sumar(@RequestParam double numero1, @RequestParam double numero2) {
        return calculadoraService.sumar(numero1, numero2);
    }

    @GetMapping("/restar")
    public double restar(@RequestParam double numero1, @RequestParam double numero2) {
        return calculadoraService.restar(numero1, numero2);
    }

    @GetMapping("/multiplicar")
    public double multiplicar(@RequestParam double numero1, @RequestParam double numero2) {
        return calculadoraService.multiplicar(numero1, numero2);
    }

    @GetMapping("/dividir")
    public double dividir(@RequestParam double numero1, @RequestParam double numero2) {
        return calculadoraService.dividir(numero1, numero2);
    }

    @GetMapping("/historial")
    public List<Operacion> obtenerHistorial() {
        List<Operacion> operaciones = calculadoraService.obtenerHistorial();

        operaciones.forEach(operacion -> {
            System.out.println("***********************");
            System.out.println();
            System.out.println("***********************");
        });

        return operaciones;
    }
}
