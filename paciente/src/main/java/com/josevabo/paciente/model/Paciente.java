package com.josevabo.paciente.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(nullable = false, unique = true)
    private String cpf;
    private LocalDate dataNascimento;
    @Column(nullable = false)
    private String nome;

    private String endereco;
    @ManyToOne(fetch= FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="cidade_id")
    private Cidade cidade;
    @OneToMany(fetch= FetchType.LAZY, mappedBy="paciente")
    private List<Prontuario> historicoMedico;


    public Paciente() {
    }

    public Paciente(String nome) {
        super();
        this.nome = nome;
    }

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Prontuario> getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(List<Prontuario> historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cidade=" + cidade +
                ", historicoMedico=" + historicoMedico +
                '}';
    }
}
