package com.josevabo.consulta.dto;

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

    private PacienteDto paciente;

    private MedicoDto medico;

    public ConsultaDto() {}


    public Long getCodigo() {
        return codigo;
    }

    public Long getCodigoPaciente() {
        return codigoPaciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Long getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setCodigoPaciente(Long codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setCodigoMedico(Long codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public PacienteDto getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteDto paciente) {
        this.paciente = paciente;
    }

    public MedicoDto getMedico() {
        return medico;
    }

    public void setMedico(MedicoDto medico) {
        this.medico = medico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultaDto entity = (ConsultaDto) o;
        return Objects.equals(this.codigo, entity.codigo) &&
                Objects.equals(this.codigoPaciente, entity.codigoPaciente) &&
                Objects.equals(this.dataHora, entity.dataHora) &&
                Objects.equals(this.codigoMedico, entity.codigoMedico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, codigoPaciente, dataHora, codigoMedico);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "codigo = " + codigo + ", " +
                "codigo_paciente = " + codigoPaciente + ", " +
                "dataHora = " + dataHora + ", " +
                "codigo_medico = " + codigoMedico + ")";
    }
}