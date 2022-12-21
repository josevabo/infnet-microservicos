package com.josevabo.consulta.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class PacienteDto {
    private Long codigo;
    private String cpf;
    private LocalDate dataNascimento;
    private String nome;
    private String endereco;
    private CidadeDto cidade;
    private List<ProntuarioDto> historicoMedico;

    public PacienteDto() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public CidadeDto getCidade() {
        return cidade;
    }

    public void setCidade(CidadeDto cidade) {
        this.cidade = cidade;
    }

    public List<ProntuarioDto> getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(List<ProntuarioDto> historicoMedico) {
        this.historicoMedico = historicoMedico;
    }
}

