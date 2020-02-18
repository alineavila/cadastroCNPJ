package com.cadastroCNPJ.rest.webservices.restfulwebservices.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastroCNPJ.rest.webservices.restfulwebservices.models.empresa;

public interface EmpresaRepository extends JpaRepository<empresa, Long>{

}
