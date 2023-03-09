package com.labseis.lpweb.ifma.lab06.dto.response;

import java.util.List;

public class ClienteResponse {

    private String nome;
    private String cpf;
    private List<LocacaoResponse> locacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<LocacaoResponse> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<LocacaoResponse> locacoes) {
        this.locacoes = locacoes;
    }
}
