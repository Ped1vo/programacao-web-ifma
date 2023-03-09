package com.sextoperiodo.web.lab06.imobiliaria.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sextoperiodo.web.lab06.imobiliaria.models.ImovelModel;

@Repository
public interface ImovelRepository extends JpaRepository<ImovelModel, UUID> {

    boolean existsByCodigo(Long codigo);

}
