package com.josevabo.paciente.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteResource {

    @GetMapping
    public String getAll() {
        System.out.println("GET recebido");
        return "Todas os Pacientes";
    }
}
