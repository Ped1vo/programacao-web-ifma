package com.labseis.lpweb.ifma.lab06.services;

import com.labseis.lpweb.ifma.lab06.entities.Imoveis;
import com.labseis.lpweb.ifma.lab06.repositories.ImoveisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImoveisService {
    @Autowired
    private ImoveisRepository imoveisRepository;

    public Page<Imoveis> findImoveis(Pageable pageable) {

        return imoveisRepository.findAll(pageable);
    }
}
