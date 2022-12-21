package com.josevabo.consulta.dto;

import java.io.Serializable;

class CidadeDto implements Serializable {
    private String nome;
    private String uf;

    public CidadeDto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
