package com.josevabo.paciente.service;

import com.josevabo.paciente.dto.ConsultaDto;
import com.josevabo.paciente.model.Paciente;
import com.josevabo.paciente.repository.PacienteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class PacienteService {

    Logger logger = LoggerFactory.getLogger(PacienteService.class);
    @Value("${consultas.api.url}")
//    @Value("http://localhost:8081/consultas")
//    @Value("http://consulta/consultas")
    private String  consultasApiUrl;
    @Autowired
    PacienteRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    public List<Paciente> listAll() {
        logger.info("Listando todos pacientes");
        return repository.findAll();
    }

    public Paciente findByCpf(String cpf) {
        logger.info("Buscando paciente por cpf: {}", cpf);
        Paciente paciente = repository.findByCpf(cpf);
        if (paciente == null) return null;
        return paciente;
    }

    public Paciente findByCodigo(Long codigo) {
        logger.info("Buscando paciente por codigo: {}", codigo);
        Paciente paciente = repository.findByCodigo(codigo);
        if (paciente == null) return null;
        return paciente;
    }

    public Paciente create(Paciente entidade) {
        logger.info("Criando paciente de nome: {}", entidade.getNome());
        if(entidade.getCodigo() != null) throw new IllegalArgumentException("codigo não pode ser informado ao criar paciente");
        return repository.save(entidade);
    }

    public List<ConsultaDto> listConsultasByCodigoPaciente(Long codigoPaciente) {
        String url = String.format("%s?codigoPaciente=%d",consultasApiUrl,codigoPaciente);
        ConsultaDto[] response =  restTemplate.getForObject(url, ConsultaDto[].class);
        return Arrays.asList(response);
    }
}
