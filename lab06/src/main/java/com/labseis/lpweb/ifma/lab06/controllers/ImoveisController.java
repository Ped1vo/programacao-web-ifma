package com.labseis.lpweb.ifma.lab06.controllers;

import com.labseis.lpweb.ifma.lab06.entities.Imoveis;
import com.labseis.lpweb.ifma.lab06.services.ImoveisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/imoveis")
public class ImoveisController {
    @Autowired
    private ImoveisService imoveisService;

    @GetMapping
    public Page<Imoveis> findImoveis(Pageable pageable) {
                return imoveisService.findImoveis(pageable);
    }
    }
