package br.com.aline.cadastroCnpj.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aline.cadastroCnpj.entity.Empresa;
import br.com.aline.cadastroCnpj.repository.EmpresaRepository;

@Service
@Transactional
public class EmpresaService {
	
	@Autowired
	EmpresaRepository empresaRepository;
	
	public List<Empresa> list(){
		return empresaRepository.findAll();
	}
	
	public Optional<Empresa> getOne(long id){
		return empresaRepository.findById(id);
		
	}
	
	
	public void save(Empresa empresa) {
		empresaRepository.save(empresa);
		
	}
	
	public void delete (long id) {
		empresaRepository.deleteById(id);
		
	}
	
	public boolean existsById(long id) {
		return empresaRepository.existsById(id);
	}
	

}
