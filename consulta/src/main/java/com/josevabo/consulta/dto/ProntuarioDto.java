package com.josevabo.consulta.dto;

import java.io.Serializable;
import java.time.LocalDate;

class ProntuarioDto implements Serializable {
    private Long codigo;
    private String descricao;
    private String crmMedico;
    private LocalDate data;

    public ProntuarioDto() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(String crmMedico) {
        this.crmMedico = crmMedico;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
