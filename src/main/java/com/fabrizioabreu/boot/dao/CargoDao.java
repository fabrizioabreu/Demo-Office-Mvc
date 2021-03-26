package com.fabrizioabreu.boot.dao;

import java.util.List;

import com.fabrizioabreu.boot.domain.Cargo;
import com.fabrizioabreu.boot.util.PaginacaoUtil;

public interface CargoDao {

	void save(Cargo departamento);

	void update(Cargo departamento);

	void delete(Long id);

	Cargo findById(Long id);

	List<Cargo> findAll();
	
	PaginacaoUtil<Cargo> buscaPaginada(int pagina);
}
