package com.fabrizioabreu.boot.service;

import java.util.List;

import com.fabrizioabreu.boot.domain.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(long id);
	
	List<Cargo> buscarTodos();
}
