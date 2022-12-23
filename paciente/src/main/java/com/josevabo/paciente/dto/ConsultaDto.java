package com.josevabo.paciente.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A DTO for the {@link com.josevabo.consulta.model.Consulta} entity
 */
public class ConsultaDto implements Serializable {
    private Long codigo;
    private Long codigoPaciente;
    private LocalDateTime dataHora;
    private Long codigoMedico;

    public ConsultaDto() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(Long codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Long getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(Long codigoMedico) {
        this.codigoMedico = codigoMedico;
    }
}