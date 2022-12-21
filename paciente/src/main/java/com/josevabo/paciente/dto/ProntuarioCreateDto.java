package com.josevabo.paciente.dto;


import com.josevabo.paciente.model.Prontuario;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the {@link Prontuario} entity
 */
public class ProntuarioCreateDto implements Serializable {
    private Long codigo;
    private String descricao;
    private PacienteDto paciente;
    private String crmMedico;
    private LocalDate data;

    public ProntuarioCreateDto() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCrmMedico() {
        return crmMedico;
    }

    public LocalDate getData() {
        return data;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public PacienteDto getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteDto paciente) {
        this.paciente = paciente;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCrmMedico(String crmMedico) {
        this.crmMedico = crmMedico;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProntuarioCreateDto entity = (ProntuarioCreateDto) o;
        return Objects.equals(this.codigo, entity.codigo) &&
                Objects.equals(this.descricao, entity.descricao) &&
                Objects.equals(this.crmMedico, entity.crmMedico) &&
                Objects.equals(this.data, entity.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descricao, crmMedico, data);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "codigo = " + codigo + ", " +
                "descricao = " + descricao + ", " +
                "crmMedico = " + crmMedico + ", " +
                "data = " + data + ")";
    }
}