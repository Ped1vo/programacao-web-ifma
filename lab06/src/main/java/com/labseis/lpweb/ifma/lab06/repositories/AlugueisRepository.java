package com.labseis.lpweb.ifma.lab06.repositories;

import com.labseis.lpweb.ifma.lab06.entities.Alugueis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlugueisRepository extends JpaRepository<Alugueis, Long> {

}
