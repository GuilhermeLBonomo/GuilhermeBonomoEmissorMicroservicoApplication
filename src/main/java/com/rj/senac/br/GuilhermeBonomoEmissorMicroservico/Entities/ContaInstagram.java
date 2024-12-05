package com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.Entities;

import java.io.Serializable;
import java.util.Objects;


public class ContaInstagram implements Serializable {
    private long id;
    private String nome;
    private boolean status;
    private short idde;

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

    public short getIdde() {
        return idde;
    }

    public void setIdde(short idde) {
        this.idde = idde;
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
                ", idde=" + idde +
                ", totalSeguidores=" + totalSeguidores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaInstagram that = (ContaInstagram) o;
        return id == that.id && status == that.status && idde == that.idde && totalSeguidores == that.totalSeguidores && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, status, idde, totalSeguidores);
    }
}
