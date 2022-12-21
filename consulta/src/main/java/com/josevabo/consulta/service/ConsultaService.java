package com.josevabo.consulta.service;

import com.josevabo.consulta.clients.MedicoClient;
import com.josevabo.consulta.clients.PacienteClient;
import com.josevabo.consulta.dto.ConsultaCreateDto;
import com.josevabo.consulta.dto.ConsultaDto;
import com.josevabo.consulta.dto.MedicoDto;
import com.josevabo.consulta.dto.PacienteDto;
import com.josevabo.consulta.model.Consulta;
import com.josevabo.consulta.repository.ConsultaRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {
    Logger logger = LoggerFactory.getLogger(ConsultaService.class);

    @Autowired
    ModelMapper mapper;
    @Autowired
    ConsultaRepository repository;

    @Autowired
    PacienteClient pacienteClient;

    @Autowired
    MedicoClient medicoClient;

    public List<Consulta> listAll() {
        logger.info("Listando todas consultas");
        return repository.findAll();
    }

    public ConsultaDto findByCodigo(Long codigo) {
        logger.info("Buscando consulta por codigo: {}", codigo);
        ConsultaDto consulta = mapper.map(repository.findByCodigo(codigo), ConsultaDto.class);
        if (consulta == null) return null;
        popularDetalhesConsulta(consulta);
        return consulta;
    }

    public ConsultaCreateDto create(ConsultaCreateDto novaConsultaDto) {
        logger.info("Criando consulta com data: {}", novaConsultaDto.getDataHora());
        if(novaConsultaDto.getCodigo() != null) throw new IllegalArgumentException("codigo não pode ser informado ao criar consulta");
        var entidade = mapper.map(novaConsultaDto, Consulta.class);
        return mapper.map(repository.save(entidade), ConsultaCreateDto.class);
    }

    private void popularDetalhesConsulta(ConsultaDto consultaDto) {
        logger.info("Buscando dados do Paciente");
        obterDadosPaciente(consultaDto);
        logger.info("Buscando dados do médico");
        obterDadosMedico(consultaDto);
    }

    private void obterDadosPaciente(ConsultaDto consultaDto) {
        PacienteDto pacienteDto = pacienteClient.getPacienteByCodigo(consultaDto.getCodigoPaciente());
        consultaDto.setPaciente(pacienteDto);

//        return consultaDto;
    }

    private void obterDadosMedico(ConsultaDto consultaDto) {
        MedicoDto medicoDto = medicoClient.getMedicoByCodigo(consultaDto.getCodigoMedico());
        consultaDto.setMedico(medicoDto);

//        return consultaDto;
    }
}
