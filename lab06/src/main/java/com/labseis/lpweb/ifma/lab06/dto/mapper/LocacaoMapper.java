package com.labseis.lpweb.ifma.lab06.dto.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.labseis.lpweb.ifma.lab06.entities.Locacoes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.labseis.lpweb.ifma.lab06.dto.response.LocacaoResponse;

@Component
public class LocacaoMapper {

    @Autowired
    private ClienteMapper clienteMapper;

    public LocacaoResponse toResponse(Locacoes locacoes) {

        LocacaoResponse locacaoResponse = new LocacaoResponse();
        locacaoResponse.setData_inicio(locacoes.getData_inicio());
        locacaoResponse.setValor_aluguel(locacoes.getValor_aluguel());
        locacaoResponse.setCliente(clienteMapper.toResponse(locacoes.getClientes()));

        return locacaoResponse;

    }

    public List<LocacaoResponse> toResponseList(List<Locacoes> locacoes) {
        return locacoes.stream().map(this::toResponse).collect(Collectors.toList());
    }
}
