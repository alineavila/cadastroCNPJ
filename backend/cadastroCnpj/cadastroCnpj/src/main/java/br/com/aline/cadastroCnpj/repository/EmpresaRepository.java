package br.com.aline.cadastroCnpj.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aline.cadastroCnpj.entity.Empresa;

@Repository
public interface EmpresaRepository  extends JpaRepository<Empresa, Long> {
	Optional<Empresa> findByNome(String nome);
	boolean existsByNome(String nome);
	
	

}
