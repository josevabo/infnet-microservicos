package com.josevabo.paciente.service;

import com.josevabo.paciente.model.Paciente;
import com.josevabo.paciente.dto.PacienteDto;
import com.josevabo.paciente.repository.PacienteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    Logger logger = LoggerFactory.getLogger(PacienteService.class);

    @Autowired
    PacienteRepository repository;

    public List<PacienteDto> listAll() {
        return repository.findAll().stream().map(PacienteDto::new).toList();
    }

    public PacienteDto findByCpf(String cpf) {
        Paciente paciente = repository.findByCpf(cpf);
        if (paciente == null) return null;
        return new PacienteDto(paciente);
    }

    public PacienteDto save(PacienteDto novoPaciente) {
        logger.info("Criando no paciente de nome: {}", novoPaciente.getNome());
        Paciente entidade = novoPaciente.toEntity();
        return new PacienteDto(repository.save(entidade));
    }
}
