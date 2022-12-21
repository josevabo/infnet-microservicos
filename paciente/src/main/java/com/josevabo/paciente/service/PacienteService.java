package com.josevabo.paciente.service;

import com.josevabo.paciente.model.Paciente;
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

    public Paciente save(Paciente entidade) {
        logger.info("Criando paciente de nome: {}", entidade.getNome());
        return repository.save(entidade);
    }
}
