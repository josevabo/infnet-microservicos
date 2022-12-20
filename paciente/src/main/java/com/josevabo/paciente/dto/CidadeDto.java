package com.josevabo.paciente.dto;

import com.josevabo.paciente.model.Cidade;
import com.josevabo.paciente.model.UnidadeFederacao;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Cidade} entity
 */
public class CidadeDto implements Serializable {
    private final String nome;
    private final UnidadeFederacao uf;

    public CidadeDto(String nome, UnidadeFederacao uf) {
        this.nome = nome;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeFederacao getUf() {
        return uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CidadeDto entity = (CidadeDto) o;
        return Objects.equals(this.nome, entity.nome) &&
                Objects.equals(this.uf, entity.uf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, uf);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "nome = " + nome + ", " +
                "uf = " + uf + ")";
    }
}