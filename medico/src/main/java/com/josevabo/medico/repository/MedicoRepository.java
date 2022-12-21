package com.josevabo.medico.repository;

import com.josevabo.medico.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    public Medico findByCodigo(Long codigo);
}
