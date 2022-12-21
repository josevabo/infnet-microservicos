package com.josevabo.paciente.resource;

import com.josevabo.paciente.dto.ProntuarioCreateDto;
import com.josevabo.paciente.dto.ProntuarioDto;
import com.josevabo.paciente.model.Prontuario;
import com.josevabo.paciente.service.ProntuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prontuarios")
public class ProntuarioResource extends AbstractResource{

    @Autowired
    ProntuarioService service;

    @GetMapping
    public ResponseEntity listAll() {
        return ResponseEntity.ok(
                mapList(service.listAll(), ProntuarioDto.class)
        );
    }

    @GetMapping("/{codigo}")
    public ResponseEntity findByCodigo(@PathVariable Long codigo) {
        return ResponseEntity.ok(
                map(service.findByCodigo(codigo), ProntuarioDto.class)
        );
    }

    @PostMapping
    public ResponseEntity create(@RequestBody ProntuarioCreateDto novoprontuarioDto) {
        var entidade = map(novoprontuarioDto, Prontuario.class);

        return ResponseEntity.ok(
                map(service.create(entidade), ProntuarioDto.class)
        );
    }
}
