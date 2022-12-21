package com.josevabo.paciente.service;

import com.josevabo.paciente.model.Prontuario;
import com.josevabo.paciente.repository.ProntuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProntuarioService {

    Logger logger = LoggerFactory.getLogger(ProntuarioService.class);

    @Autowired
    ProntuarioRepository repository;

    public List<Prontuario> listAll() {
        logger.info("Listando todos pacientes");
        return repository.findAll();
    }

    public Prontuario findByCodigo(Long codigo) {
        logger.info("Buscando prontuario por codigo: {}", codigo);
        Prontuario prontuario = repository.findByCodigo(codigo);
        if (prontuario == null) return null;
        return prontuario;
    }

    public Prontuario create(Prontuario entidade) {
        logger.info("Criando prontuario do paciente: {}", entidade.getPaciente().getNome());
        if(entidade.getCodigo() != null) throw new IllegalArgumentException("codigo não pode ser informado ao criar prontuario");
        return repository.save(entidade);
    }
}
