package com.fabrizioabreu.boot.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fabrizioabreu.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

	@Override
	public List<Funcionario> findByNome(String nome) {
		return createQuery("select f from Funcionario f where f.nome like concat('%',?1,'%')", nome);
	}

	@Override
	public List<Funcionario> findByCargoId(Long id) {
		return createQuery("select c from Funcionario c where c.cargo.id = ?1", id);
	}

	@Override
	public List<Funcionario> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida) {
		String jpql = new StringBuilder("select d from Funcionario d ")
				.append("where d.dataEntrada >= ?1 and d.dataSaida <= ?2 ")
				.append("order by d.dataEntrada asc")
				.toString();
		return createQuery(jpql, entrada, saida);
	}

	@Override
	public List<Funcionario> findByDataEntrada(LocalDate entrada) {
		String jpql = new StringBuilder("select d from Funcionario d ")
				.append("where d.dataEntrada = ?1 ")
				.append("order by d.dataEntrada asc")
				.toString();
		return createQuery(jpql, entrada);
	}

	@Override
	public List<Funcionario> findByDataSaida(LocalDate saida) {
		String jpql = new StringBuilder("select d from Funcionario d ")
				.append("where d.dataSaida = ?1 ")
				.append("order by d.dataEntrada asc")
				.toString();
		return createQuery(jpql, saida);
	}
}
