package com.aline.cadastroCnpj;

import java.util.List;

public interface EmpresaService {
	
	/*aqui estará todos os métodos necessários utilizados no projeto*/
	
	List<Empresa>listar();
	Empresa listarId(int id);
	Empresa add(Empresa empresa);
	Empresa edit(Empresa empresa);
	Empresa delete(int id);
	
	

}
