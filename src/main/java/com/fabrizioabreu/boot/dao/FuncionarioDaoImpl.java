package com.fabrizioabreu.boot.dao;

import org.springframework.stereotype.Repository;

import com.fabrizioabreu.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

}
