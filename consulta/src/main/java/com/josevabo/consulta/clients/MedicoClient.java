package com.josevabo.consulta.clients;

import com.josevabo.consulta.dto.MedicoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "medico")
public interface MedicoClient {

    @GetMapping("/medicos")
    ResponseEntity<List<MedicoDto>> getProdutos();

    @GetMapping("/medicos/{codigo}")
    MedicoDto getMedicoByCodigo(@PathVariable Long codigo);
}
