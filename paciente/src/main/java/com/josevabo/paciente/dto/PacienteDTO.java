package com.josevabo.paciente.dto;

import com.josevabo.paciente.model.Cidade;
import com.josevabo.paciente.model.Prontuario;

import java.time.LocalDate;
import java.util.List;

public class PacienteDTO {

    private String cpf;
    private LocalDate dataNascimento;
    private String nome;
    private String endereco;
    private CidadeDTO cidade;
    private List<ProntuarioDTO> historicoMedico;
}
