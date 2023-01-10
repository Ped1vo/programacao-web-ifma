package com.labseis.lpweb.ifma.lab06.repositories;

import com.labseis.lpweb.ifma.lab06.entities.Imoveis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImoveisRepository extends JpaRepository<Imoveis, Long> {
}

