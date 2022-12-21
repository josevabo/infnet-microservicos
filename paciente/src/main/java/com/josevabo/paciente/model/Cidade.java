package com.josevabo.paciente.model;

import com.josevabo.paciente.model.converter.UnidadeFederacaoConverter;
import jakarta.persistence.*;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"nome", "uf"}))
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(nullable = false)
    private String nome;

    @Convert(converter = UnidadeFederacaoConverter.class)
    private UnidadeFederacao uf;

    public Cidade() {
    }
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public UnidadeFederacao getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if(uf != null){
            this.uf = UnidadeFederacao.fromSigla(uf);
        }
    }


    public void setUf(UnidadeFederacao uf) {
        this.uf = uf;
    }

}
