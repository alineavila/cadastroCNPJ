package com.aline.cadastroCnpj;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface EmpresaRepository extends Repository<Empresa, Integer>{
	List<Empresa>findAll();
	Empresa findOne(int id);
	Empresa save(Empresa empresa);
	Empresa delete(Empresa empresa);
	

}
