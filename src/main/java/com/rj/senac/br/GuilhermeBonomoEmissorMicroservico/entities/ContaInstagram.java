package com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;


public class ContaInstagram implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id",nullable = false)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "status", nullable = false)
    private boolean status;
    @Column(name = "idade", nullable = false)
    private short idade;
    @Column(name = "totalseguidores", nullable = false)
    private int totalSeguidores;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public int getTotalSeguidores() {
        return totalSeguidores;
    }

    public void setTotalSeguidores(int totalSeguidores) {
        this.totalSeguidores = totalSeguidores;
    }

    @Override
    public String toString() {
        return "ContaInstagram{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", status=" + status +
                ", idde=" + idade +
                ", totalSeguidores=" + totalSeguidores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaInstagram that = (ContaInstagram) o;
        return id == that.id && status == that.status && idade == that.idade && totalSeguidores == that.totalSeguidores && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, status, idade, totalSeguidores);
    }
}
