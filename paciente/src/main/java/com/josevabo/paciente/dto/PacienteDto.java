package com.josevabo.paciente.dto;

import com.josevabo.paciente.dto.CidadeDto;
import com.josevabo.paciente.dto.ProntuarioDto;
import com.josevabo.paciente.model.Paciente;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link Paciente} entity
 */
public class PacienteDto implements Serializable {
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

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public CidadeDto getCidade() {
        return cidade;
    }

    public List<ProntuarioDto> getHistoricoMedico() {
        return historicoMedico;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(CidadeDto cidade) {
        this.cidade = cidade;
    }

    public void setHistoricoMedico(List<ProntuarioDto> historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PacienteDto entity = (PacienteDto) o;
        return Objects.equals(this.codigo, entity.codigo) &&
                Objects.equals(this.cpf, entity.cpf) &&
                Objects.equals(this.dataNascimento, entity.dataNascimento) &&
                Objects.equals(this.nome, entity.nome) &&
                Objects.equals(this.endereco, entity.endereco) &&
                Objects.equals(this.cidade, entity.cidade) &&
                Objects.equals(this.historicoMedico, entity.historicoMedico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, cpf, dataNascimento, nome, endereco, cidade, historicoMedico);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "codigo = " + codigo + ", " +
                "cpf = " + cpf + ", " +
                "dataNascimento = " + dataNascimento + ", " +
                "nome = " + nome + ", " +
                "endereco = " + endereco + ", " +
                "cidade = " + cidade + ", " +
                "historicoMedico = " + historicoMedico + ")";
    }

}