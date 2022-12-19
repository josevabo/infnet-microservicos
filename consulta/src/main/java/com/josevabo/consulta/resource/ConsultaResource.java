package com.josevabo.consulta.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultas")
public class ConsultaResource {

    @GetMapping
    public String getAll() {
        return "Todas as consultas";
    }
}
