package com.josevabo.consulta.repository;

import com.josevabo.consulta.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    public Consulta findByCodigo(Long codigo);
}