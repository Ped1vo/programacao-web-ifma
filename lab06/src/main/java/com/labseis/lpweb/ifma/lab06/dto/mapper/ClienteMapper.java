package com.labseis.lpweb.ifma.lab06.dto.mapper;

import com.labseis.lpweb.ifma.lab06.entities.Clientes;
import org.springframework.stereotype.Component;

import com.labseis.lpweb.ifma.lab06.dto.response.ClienteResponse;

@Component
public class ClienteMapper {

    public ClienteResponse toResponse(Clientes cliente) {

        ClienteResponse clienteResponse = new ClienteResponse();
        clienteResponse.setNome(cliente.getNome());
        clienteResponse.setCpf(cliente.getCpf());
        return clienteResponse;
    }
}
