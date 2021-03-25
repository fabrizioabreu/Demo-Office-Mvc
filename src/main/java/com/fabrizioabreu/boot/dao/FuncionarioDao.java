package com.fabrizioabreu.boot.dao;

import java.util.List;

import com.fabrizioabreu.boot.domain.Funcionario;

public interface FuncionarioDao {

void save(Funcionario departamento);
	
	void update(Funcionario departamento);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();

	List<Funcionario> findByNome(String nome);

	List<Funcionario> findByCargoId(Long id);
}
