package org.focorh.sistemarh.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_funcionarios")
public class Funcionarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotBlank
	private String nome;
	
	@NotNull
	@NotBlank
	private String cargo;
	
	@NotNull
	@NotBlank
	private String departamento;
	
	@UpdateTimestamp
	private LocalDateTime data_admissao;
	
	private LocalDateTime data_demissao;
	
	@NotNull
	@NotBlank
	private String tipo_contrato;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public LocalDateTime getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(LocalDateTime data_admissao) {
		this.data_admissao = data_admissao;
	}

	public LocalDateTime getData_demissao() {
		return data_demissao;
	}

	public void setData_demissao(LocalDateTime data_demissao) {
		this.data_demissao = data_demissao;
	}

	public String getTipo_contrato() {
		return tipo_contrato;
	}

	public void setTipo_contrato(String tipo_contrato) {
		this.tipo_contrato = tipo_contrato;
	}

}