package com.josevabo.paciente.repository;

import com.josevabo.paciente.model.Paciente;
import com.josevabo.paciente.model.Prontuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProntuarioRepository extends JpaRepository<Prontuario, Long> {

    Prontuario findByCodigo(Long codigo);
}
