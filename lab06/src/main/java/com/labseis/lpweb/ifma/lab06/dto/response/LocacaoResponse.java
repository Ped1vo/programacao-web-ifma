package com.labseis.lpweb.ifma.lab06.dto.response;

import java.time.LocalDate;

public class LocacaoResponse {

    private LocalDate data_inicio;
    private double valor_aluguel;
    private ClienteResponse cliente;

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public double getValor_aluguel() {
        return valor_aluguel;
    }

    public void setValor_aluguel(double valor_aluguel) {
        this.valor_aluguel = valor_aluguel;
    }

    public ClienteResponse getCliente() {
        return cliente;
    }

    public void setCliente(ClienteResponse cliente) {
        this.cliente = cliente;
    }
}
