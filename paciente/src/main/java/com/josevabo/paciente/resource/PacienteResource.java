package com.josevabo.paciente.resource;

import com.josevabo.paciente.dto.PacienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.josevabo.paciente.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteResource {

    @Autowired
    PacienteService service;

    @GetMapping
    public ResponseEntity listAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping("/{cpf}")
    public ResponseEntity findByCpf(@PathVariable String cpf) {
        return ResponseEntity.ok(service.findByCpf(cpf));
    }

    @PostMapping
    public ResponseEntity create(@RequestBody PacienteDto novoPaciente) {
        return ResponseEntity.ok(service.save(novoPaciente));
    }
}
