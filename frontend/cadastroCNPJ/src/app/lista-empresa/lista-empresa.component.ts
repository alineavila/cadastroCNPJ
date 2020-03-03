import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import * as $ from "jquery";
import { HelloWorldDataService } from '../service/data/hello-world-data.service';
import { EmpresaService } from '../service/data/empresa.service';

export class Empresa {
  public id?: number;
  public cnpj: string;
  public tipo: string;
  public nome: string;
  public razaoSocial: string;
  public contato: number;
  public email: string;
  public cep: number;
  public uf: string;


  constructor(
     cnpj: string,
     tipo: string,
     nome: string,
     razaoSocial: string,
     contato: number,
     email: string,
     cep: number,
     uf: string) {

      this.cnpj = cnpj;
      this.tipo = tipo;
      this.nome = nome;
      this.razaoSocial = razaoSocial; 
      this.contato = contato;
      this.email  = email;
      this.cep = cep;
      this.uf = uf;

  }
}

@Component({
  selector: 'app-lista-empresa',
  templateUrl: './lista-empresa.component.html',
  styleUrls: ['./lista-empresa.component.css']
})

export class ListaEmpresaComponent implements OnInit {

  empresas: Empresa[] = [];



  constructor(
    private empresaService: EmpresaService,
    private router: Router,
    private service: HelloWorldDataService) { }

  ngOnInit() {
    this.listaEmpresas();
  }


  listaEmpresas(): void {
    this.empresaService.getEmpresas().subscribe(
      data => {
        this.empresas = data;
      },
      err => {
        console.log(err);
      }
    )

  }

  novaEmpresa() {
    this.router.navigate(["formularioNovo"])

  }

  editaEmpresa(){
    this.router.navigate(["formularioNovo"])
  }



}
