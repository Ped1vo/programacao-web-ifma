package com.sextoperiodo.web.lab06.imobiliaria.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;

public class ImovelDto {
    @NotBlank
    private UUID id;
    @NotBlank
    private Long codigo;
    @NotBlank
    private String tipoImovel;
    @NotBlank
    private String endereco;
    @NotBlank
    private String cep;
    @NotBlank
    private String dormitorios;
    @NotBlank
    private String banheiros;
    @NotBlank
    private String suites;
    @NotBlank
    private String metragem;
    @NotBlank
    private String valorSugerido;
    private String obs;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
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

    public String getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(String dormitorios) {
        this.dormitorios = dormitorios;
    }

    public String getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(String banheiros) {
        this.banheiros = banheiros;
    }

    public String getSuites() {
        return suites;
    }

    public void setSuites(String suites) {
        this.suites = suites;
    }

    public String getMetragem() {
        return metragem;
    }

    public void setMetragem(String metragem) {
        this.metragem = metragem;
    }

    public String getValorSugerido() {
        return valorSugerido;
    }

    public void setValorSugerido(String valorSugerido) {
        this.valorSugerido = valorSugerido;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

}
