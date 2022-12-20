package com.josevabo.paciente.model;

import com.josevabo.paciente.model.converter.UnidadeFederacaoConverter;
import jakarta.persistence.*;

@Entity
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;

    @Convert(converter = UnidadeFederacaoConverter.class)
    private UnidadeFederacao uf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
