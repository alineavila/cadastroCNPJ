package br.com.aline.cadastroCnpj;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface EmpresaRepositorio extends Repository<Empresa, Integer>{
	
	List<Empresa>findAll();
	Empresa findOne(int id);
	Empresa save(Empresa e);
	void delete(Empresa e);

}
