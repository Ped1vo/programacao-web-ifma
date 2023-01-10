package com.labseis.lpweb.ifma.lab06.services;

import com.labseis.lpweb.ifma.lab06.entities.Clientes;
import com.labseis.lpweb.ifma.lab06.repositories.ClientesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Optional;

@Service
public class ClientesService {
    @Autowired
    private ClientesRepository repository;

    public Page<Clientes> findClientes(String minDate, String maxDate, Pageable pageable) {

        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

        LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("") ? today.minusDays(365) : LocalDate.parse(maxDate);

        return repository.findClientes(min, max, pageable);
    }

    public Optional<Clientes> findById(Long id){
        return repository.findById(id);
    }

    @Transactional
    public Clientes save(Clientes clientes){
        return repository.save(clientes);
    }

    @Transactional
    public void deleteById(Long id){
        repository.deleteById(id);
    }

}
