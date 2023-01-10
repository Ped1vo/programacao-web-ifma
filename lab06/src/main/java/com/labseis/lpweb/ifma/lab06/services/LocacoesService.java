package com.labseis.lpweb.ifma.lab06.services;

import com.labseis.lpweb.ifma.lab06.entities.Locacoes;
import com.labseis.lpweb.ifma.lab06.repositories.LocacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LocacoesService {
    @Autowired
    private LocacoesRepository locacoesRepository;

    public Page<Locacoes> findLocacoes(Pageable pageable) {

        return locacoesRepository.findAll(pageable);
    }

}
