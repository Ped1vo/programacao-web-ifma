package com.sextoperiodo.web.lab06.imobiliaria.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sextoperiodo.web.lab06.imobiliaria.models.ClienteModel;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, UUID> {

    boolean existsByCpf(String cpf);

}
