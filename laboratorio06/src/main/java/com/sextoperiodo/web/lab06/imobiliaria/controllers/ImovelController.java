package com.sextoperiodo.web.lab06.imobiliaria.controllers;

import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sextoperiodo.web.lab06.imobiliaria.dtos.ClienteDto;
import com.sextoperiodo.web.lab06.imobiliaria.dtos.ImovelDto;
import com.sextoperiodo.web.lab06.imobiliaria.models.ClienteModel;
import com.sextoperiodo.web.lab06.imobiliaria.models.ImovelModel;
import com.sextoperiodo.web.lab06.imobiliaria.services.ImovelService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/imoveis")
public class ImovelController {

    final ImovelService imovelService;

    public ImovelController(ImovelService imovelService) {
        this.imovelService = imovelService;
    }

    @PostMapping
    public ResponseEntity<Object> criaImovel(@RequestBody @Valid ImovelDto imovelDto) {
        if (imovelService.existsByCodigo(imovelDto.getCodigo())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Imovel ja cadastrado!");
        }
        var imovelModel = new ImovelModel();
        BeanUtils.copyProperties(imovelDto, imovelModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(imovelService.save(imovelModel));
    }

}
