package com.cadastroCNPJ.rest.webservices.restfulwebservices.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastroCNPJ.rest.webservices.restfulwebservices.models.repository.EmpresaRepository;
import com.cadastroCNPJ.rest.webservices.restfulwebservices.models.empresa;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class EmpresaResource {
	
	@Autowired
	EmpresaRepository empresaRepository;
	
	@GetMapping("/empresas")
	public List<empresa> listaEmpresas(){
		return empresaRepository.findAll();
	}
	

}
