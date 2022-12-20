package com.josevabo.paciente.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prontuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    @ManyToOne
    @JoinColumn(name="codigo_paciente")
    private Paciente paciente;
    private String descricao;
    private String crmMedico;
    private LocalDate data;
}
