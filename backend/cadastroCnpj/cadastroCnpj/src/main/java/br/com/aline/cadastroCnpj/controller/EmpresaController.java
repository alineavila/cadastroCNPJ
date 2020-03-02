package br.com.aline.cadastroCnpj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aline.cadastroCnpj.dto.EmpresaDto;
import br.com.aline.cadastroCnpj.entity.Empresa;
import br.com.aline.cadastroCnpj.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
@CrossOrigin
public class EmpresaController {
	
	@Autowired
	EmpresaService empresaService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Empresa>> list(){
		List<Empresa> list = empresaService.list();
		return new ResponseEntity<List<Empresa>>(list, HttpStatus.OK);
		
		
	}
	
	@GetMapping("/detail/{id}")
	public ResponseEntity<Empresa> getByID(@PathVariable("id") long id){
		Empresa empresa = empresaService.getOne(id).get();
		return new ResponseEntity<Empresa>(empresa, HttpStatus.OK);
	}
	
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody EmpresaDto empresaDto){
		Empresa empresa = new Empresa(empresaDto.getCnpj(), empresaDto.getContato(), empresaDto.getEmail(), empresaDto.getNome(), empresaDto.getRazao_social(), empresaDto.getTipo(), empresaDto.getTipo(), empresaDto.getUf());
		empresaService.save(empresa);
		return new ResponseEntity<Empresa>(empresa, HttpStatus.OK); 
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody EmpresaDto empresaDto){
		Empresa empresa = empresaService.getOne(id).get();
		empresa.setNome(empresaDto.getNome());
		empresaService.save(empresa);
		return new ResponseEntity<Empresa>(empresa, HttpStatus.OK); 
		
	}
	
	@DeleteMapping("/{id}")
	@CrossOrigin()
	public void destroy(@PathVariable(value="id") long id) {
		empresaService.delete(id);
	}
	

}
