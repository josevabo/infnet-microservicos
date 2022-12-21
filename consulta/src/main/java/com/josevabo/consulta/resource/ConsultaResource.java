package com.josevabo.consulta.resource;

import com.josevabo.consulta.dto.ConsultaCreateDto;
import com.josevabo.consulta.dto.ConsultaDto;
import com.josevabo.consulta.model.Consulta;
import com.josevabo.consulta.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consultas")
public class ConsultaResource extends AbstractResource {
    @Autowired
    ConsultaService service;

    @GetMapping
    public ResponseEntity listAll() {
        return ResponseEntity.ok(
                mapList(service.listAll(), ConsultaDto.class)
        );
    }

    @GetMapping("/{codigo}")
    public ResponseEntity findByCodigo(@PathVariable Long codigo) {
        return ResponseEntity.ok(
                service.findByCodigo(codigo)
        );
    }

    @PostMapping
    public ResponseEntity create(@RequestBody ConsultaCreateDto novaConsultaDto) {
        return ResponseEntity.ok(
                service.create(novaConsultaDto)
        );
    }
}
