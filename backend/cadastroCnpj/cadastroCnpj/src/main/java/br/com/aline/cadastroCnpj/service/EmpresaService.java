package br.com.aline.cadastroCnpj.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aline.cadastroCnpj.repository.EmpresaRepository;

@Service
@Transactional
public class EmpresaService {
	
	@Autowired
	EmpresaRepository empresaRepository;

}
