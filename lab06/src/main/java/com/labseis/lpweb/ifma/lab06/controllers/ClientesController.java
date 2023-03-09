package com.labseis.lpweb.ifma.lab06.controllers;

import com.labseis.lpweb.ifma.lab06.entities.Clientes;
import com.labseis.lpweb.ifma.lab06.services.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clientes")
public class ClientesController {
    @Autowired
    private ClientesService service;

    @GetMapping
    public Page<Clientes> findClientes(
            @RequestParam(value = "minDate", defaultValue = "") String minDate,
            @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
            Pageable pageable) {
        return service.findClientes(minDate, maxDate, pageable);

    }

    /*
     * @PostMapping
     * public ResponseEntity<Clientes> criarCliente(@RequestBody Clientes clientes,
     * HttpServletResponse response) {
     * Clientes clienteSalvo = service.save(clientes);
     * 
     * publisher.PublishEvent(new HeaderLocationEvento(this, response,
     * clientes.getId()));
     * return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalvo);
     * }
     */

}
