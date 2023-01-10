package com.labseis.lpweb.ifma.lab06.services;

import com.labseis.lpweb.ifma.lab06.entities.Alugueis;
import com.labseis.lpweb.ifma.lab06.repositories.AlugueisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlugueisService {

    @Autowired
    private AlugueisRepository alugueisRepository;

    public Page<Alugueis> findAlugueis(Pageable pageable) {

        return alugueisRepository.findAll(pageable);
    }

}
