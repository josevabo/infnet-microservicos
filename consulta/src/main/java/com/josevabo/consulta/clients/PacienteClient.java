package com.josevabo.consulta.clients;

import com.josevabo.consulta.dto.PacienteDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("paciente")
public interface PacienteClient {

    @GetMapping("/pacientes")
    ResponseEntity<List<PacienteDto>> getPacientes();

    @GetMapping("/pacientes/{codigo}")
    PacienteDto getPacienteByCodigo(@PathVariable Long codigo);
}
