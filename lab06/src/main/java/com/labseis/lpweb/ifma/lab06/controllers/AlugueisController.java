package com.labseis.lpweb.ifma.lab06.controllers;

import com.labseis.lpweb.ifma.lab06.entities.Alugueis;
import com.labseis.lpweb.ifma.lab06.services.AlugueisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alugueis")
public class AlugueisController {

    @Autowired
    private AlugueisService alugueisService;

    @GetMapping
    public Page<Alugueis> findAlugueis(Pageable pageable) {
        return alugueisService.findAlugueis(pageable);
    }

}
