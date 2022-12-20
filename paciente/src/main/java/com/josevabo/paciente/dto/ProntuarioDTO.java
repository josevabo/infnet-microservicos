package com.josevabo.paciente.dto;

import com.josevabo.paciente.model.Paciente;

import java.time.LocalDate;

public class ProntuarioDTO {
    private PacienteDTO paciente;
    private String descricao;
    private String crmMedico;
    private LocalDate data;
}
