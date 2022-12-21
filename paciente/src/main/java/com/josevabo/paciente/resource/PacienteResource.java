package com.josevabo.paciente.resource;

import com.josevabo.paciente.dto.PacienteDto;
import com.josevabo.paciente.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.josevabo.paciente.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteResource extends AbstractResource{

    @Autowired
    PacienteService service;

    @GetMapping
    public ResponseEntity listAll() {
        return ResponseEntity.ok(
                mapList(service.listAll(), PacienteDto.class)
        );
    }

    @GetMapping("/{cpf}")
    public ResponseEntity findByCpf(@PathVariable String cpf) {
        return ResponseEntity.ok(
                map(service.findByCpf(cpf), PacienteDto.class)
        );
    }

    @PostMapping
    public ResponseEntity create(@RequestBody PacienteDto novoPacienteDto) {
        var entidade = map(novoPacienteDto, Paciente.class);

        return ResponseEntity.ok(
                map(service.create(entidade), PacienteDto.class)
        );
    }
}
