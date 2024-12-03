package org.focorh.sistemarh.repository;

import java.util.List;

import org.focorh.sistemarh.model.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface FuncionariosRepository extends JpaRepository <Funcionarios, Long> {
	public List <Funcionarios> findAllByCargoContainingIgnoreCase(@Param("cargo") String cargo);
	public List <Funcionarios> findAllByDepartamentoContainingIgnoreCase(@Param("departamento") String departamento);
	

}
