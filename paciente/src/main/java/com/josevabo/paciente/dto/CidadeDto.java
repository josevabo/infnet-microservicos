package com.josevabo.paciente.dto;

import com.josevabo.paciente.model.Cidade;
import com.josevabo.paciente.model.UnidadeFederacao;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Cidade} entity
 */
public class CidadeDto implements Serializable {
    private Long codigo;
    private String nome;
    private String uf;

    public CidadeDto() {
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setUf(UnidadeFederacao uf) {
        if (uf != null) this.uf = uf.sigla();
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
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