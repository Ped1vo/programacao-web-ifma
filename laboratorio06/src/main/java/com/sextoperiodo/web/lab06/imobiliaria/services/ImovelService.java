package com.sextoperiodo.web.lab06.imobiliaria.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.sextoperiodo.web.lab06.imobiliaria.models.ImovelModel;
import com.sextoperiodo.web.lab06.imobiliaria.repositories.ImovelRepository;

import jakarta.transaction.Transactional;

@Service
public class ImovelService {
    final ImovelRepository imovelRepository;

    public ImovelService(ImovelRepository imovelRepository) {
        this.imovelRepository = imovelRepository;
    }

    @Transactional
    public ImovelModel save(ImovelModel imovelModel) {
        return imovelRepository.save(imovelModel);
    }

    public boolean existsByCodigo(Long codigo) {
        return imovelRepository.existsByCodigo(codigo);
    }

}
