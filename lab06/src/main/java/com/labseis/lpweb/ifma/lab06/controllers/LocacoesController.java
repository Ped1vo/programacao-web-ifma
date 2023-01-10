package com.labseis.lpweb.ifma.lab06.controllers;

import com.labseis.lpweb.ifma.lab06.entities.Locacoes;
import com.labseis.lpweb.ifma.lab06.services.LocacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/locacoes")
public class LocacoesController {
    @Autowired
    private LocacoesService locacoesService;

    public Page<Locacoes> findLocacoes(Pageable pageable) {
        return locacoesService.findLocacoes(pageable);
    }
}
