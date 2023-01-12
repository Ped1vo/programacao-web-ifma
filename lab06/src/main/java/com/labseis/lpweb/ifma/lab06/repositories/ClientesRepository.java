package com.labseis.lpweb.ifma.lab06.repositories;

import com.labseis.lpweb.ifma.lab06.entities.Clientes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {
    // @Query("SELECT obj FROM Clientes obj WHERE obj.nascimento BETWEEN :minDate
    // AND :maxDate ORDER BY obj.nome DESC")
    @Query("SELECT obj FROM Clientes obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.id DESC")
    Page<Clientes> findClientes(LocalDate min, LocalDate max, Pageable pageable);
}
