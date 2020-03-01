package br.com.aline.cadastroCnpj;

import java.util.List;

// aqui estarão todos os métodos utilizados para a manipulação de empresas

public interface EmpresaService {
	
	List<Empresa>listar();
	Empresa listarId(int id);
	Empresa add(Empresa e);
	Empresa edit(Empresa e);
	Empresa delete(int id);
	
}
