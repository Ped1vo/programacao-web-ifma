package com.labseis.lpweb.ifma.lab06.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_alugueis")
public class Alugueis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "locacoes_id")
    private Locacoes locacoes;
    private LocalDate data_vencimento;
    private double valor_pago;
    private String observacoes;

    public Locacoes getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(Locacoes locacoes) {
        this.locacoes = locacoes;
    }

    public Alugueis() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(LocalDate data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Alugueis{" +
                "id=" + id +
                ", locacoes=" + locacoes +
                ", data_vencimento=" + data_vencimento +
                ", valor_pago=" + valor_pago +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alugueis alugueis = (Alugueis) o;
        return Objects.equals(id, alugueis.id) && Objects.equals(locacoes, alugueis.locacoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, locacoes);
    }
}
