package com.umg.calculadora.repository;

import com.umg.calculadora.model.Operacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OperacionRepository extends JpaRepository<Operacion, Long> {


    @Query("" +
            "SELECT new com.umg.calculadora.model.Operacion(a.id, a.tipoOperacion, " +
            "a.numero1, " +
            "a.numero2, " +
            "a.resultado, " +
            "a.fechaOperacion" +
            ") " +
            "FROM Operacion a" +
            "")
    List<Operacion> findAllOperations();


}

