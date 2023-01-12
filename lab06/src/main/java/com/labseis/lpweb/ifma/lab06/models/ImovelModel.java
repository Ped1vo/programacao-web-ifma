package com.labseis.lpweb.ifma.lab06.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_imoveis")
public class Imoveis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo_imovel;
    private String endereco;
    private String cep;
    private int dormitorios;
    private int banheiros;
    private int suites;
    private int metragem;
    private int valor_aluguel_sugerido;
    private String observacoes;

    public Imoveis() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_imovel() {
        return tipo_imovel;
    }

    public void setTipo_imovel(String tipo_imovel) {
        this.tipo_imovel = tipo_imovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getMetragem() {
        return metragem;
    }

    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }

    public int getValor_aluguel_sugerido() {
        return valor_aluguel_sugerido;
    }

    public void setValor_aluguel_sugerido(int valor_aluguel_sugerido) {
        this.valor_aluguel_sugerido = valor_aluguel_sugerido;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Imoveis{" +
                "id=" + id +
                ", tipo_imovel='" + tipo_imovel + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cep='" + cep + '\'' +
                ", dormitorios=" + dormitorios +
                ", banheiros=" + banheiros +
                ", suites=" + suites +
                ", metragem=" + metragem +
                ", valor_aluguel_sugerido=" + valor_aluguel_sugerido +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imoveis imoveis = (Imoveis) o;
        return Objects.equals(id, imoveis.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
