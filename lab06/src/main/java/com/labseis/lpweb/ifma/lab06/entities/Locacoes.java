package com.labseis.lpweb.ifma.lab06.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_locacoes")
public class Locacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "clientes_id")
    private Clientes clientes;
    @ManyToOne
    @JoinColumn(name = "imoveis_id")
    private Imoveis imoveis;
    private int ativo;
    private LocalDate data_inicio;
    private LocalDate data_fim;
    private int dia_vencimento;
    private int valor_multa;
    private double valor_aluguel;
    private String observacoes;

    public Imoveis getImoveis() {
        return imoveis;
    }

    public void setImoveis(Imoveis imoveis) {
        this.imoveis = imoveis;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }


    public Locacoes() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDate getData_fim() {
        return data_fim;
    }

    public void setData_fim(LocalDate data_fim) {
        this.data_fim = data_fim;
    }

    public int getDia_vencimento() {
        return dia_vencimento;
    }

    public void setDia_vencimento(int dia_vencimento) {
        this.dia_vencimento = dia_vencimento;
    }

    public int getValor_multa() {
        return valor_multa;
    }

    public void setValor_multa(int valor_multa) {
        this.valor_multa = valor_multa;
    }

    public double getValor_aluguel() {
        return valor_aluguel;
    }

    public void setValor_aluguel(double valor_aluguel) {
        this.valor_aluguel = valor_aluguel;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Locacoes{" +
                "id=" + id +
                ", clientes=" + clientes +
                ", imoveis=" + imoveis +
                ", ativo=" + ativo +
                ", data_inicio=" + data_inicio +
                ", data_fim=" + data_fim +
                ", dia_vencimento=" + dia_vencimento +
                ", valor_multa=" + valor_multa +
                ", valor_aluguel=" + valor_aluguel +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locacoes locacoes = (Locacoes) o;
        return Objects.equals(id, locacoes.id) && Objects.equals(clientes, locacoes.clientes) && Objects.equals(imoveis, locacoes.imoveis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientes, imoveis);
    }
}