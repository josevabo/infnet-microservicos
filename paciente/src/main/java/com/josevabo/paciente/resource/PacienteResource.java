package com.josevabo.paciente.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteResource {

    @GetMapping
    public String listAll() {
        System.out.println("GET recebido");
        return "Todas os Pacientes";
    }

    @GetMapping("/{cpf}")
    public String findByCpf(@PathVariable String cpf) {
        return "Paciente pelo cpf";
    }
}
