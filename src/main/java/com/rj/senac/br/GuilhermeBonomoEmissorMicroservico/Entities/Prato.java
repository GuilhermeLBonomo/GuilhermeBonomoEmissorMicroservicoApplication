package com.rj.senac.br.GuilhermeBonomoEmissorMicroservico.Entities;

import java.io.Serializable;
import java.util.Objects;


public class Prato implements Serializable {
    private long id;
    private String descricao;
    private short status;
    private double preco;

    public long getId() {
        return id;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Prato{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prato prato)) return false;
        return getId() == prato.getId() && getStatus() == prato.getStatus() && Double.compare(getPreco(), prato.getPreco()) == 0 && Objects.equals(getDescricao(), prato.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescricao(), getStatus(), getPreco());
    }

    public Prato(String descricao, short status, double preco) {
        this.descricao = descricao;
        this.status = status;
        this.preco = preco;
    }
}
