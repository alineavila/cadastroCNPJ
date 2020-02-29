package com.aline.cadastroCnpj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class EmpresaServiceImp implements EmpresaService{
	@Autowired
	private EmpresaRepository repositorio;
	
	
	@Override
	public List<Empresa> listar() {
		return repositorio.findAll();
	}

	@Override
	public Empresa listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa add(Empresa empresa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa edit(Empresa empresa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
