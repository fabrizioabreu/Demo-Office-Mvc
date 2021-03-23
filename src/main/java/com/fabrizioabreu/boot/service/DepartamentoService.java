package com.fabrizioabreu.boot.service;

import java.util.List;

import com.fabrizioabreu.boot.domain.Departamento;

public interface DepartamentoService {

	void salvar(Departamento departamento);

	void editar(Departamento departamento);

	void excluir(Long id);

	Departamento buscarPorId(long id);

	List<Departamento> buscarTodos();
}
