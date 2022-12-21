package com.josevabo.consulta.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(nullable = false)
    private Long codigoPaciente;
    @Column(nullable = false)
    private LocalDateTime dataHora;
    @Column(nullable = false)
    private Long codigoMedico;

    public Consulta() {
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
