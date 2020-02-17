import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import * as $ from "jquery";
import { HelloWorldDataService } from '../service/data/hello-world-data.service';

export class Empresa {
  constructor(
    public id: number,
    public cnpj: string,
    public tipo: string,  
    public nome: string,
    public razaoSocial: string,
    public contato: number, 
    public email: string, 
    public cep: number,
    public uf: string, 
    public data: Date

  ){

  }
}

@Component({
  selector: 'app-lista-empresa',
  templateUrl: './lista-empresa.component.html',
  styleUrls: ['./lista-empresa.component.css']
})
export class ListaEmpresaComponent implements OnInit {

  empresas = [
    new Empresa(1, "10000000000000", "pequeno porte", "Magazine Luiza", "clara Magazine Luiza S/A", 61982191870, "magazine@magazine.com", 1000000000, "df", new Date()),
    new Empresa(2, "10000000000000", "pequeno porte", "Magazine Luiza", "clara Magazine Luiza S/A", 61982191870, "magazine@magazine.com", 1000000000, "df", new Date()),
    new Empresa(3, "10000000000000", "pequeno porte", "Magazine Luiza", "clara Magazine Luiza S/A", 61982191870, "magazine@magazine.com", 1000000000, "df", new Date()),
    new Empresa(4, "10000000000000", "pequeno porte", "Magazine Luiza", "clara Magazine Luiza S/A", 61982191870, "magazine@magazine.com", 1000000000, "df", new Date()),
    new Empresa(5, "10000000000000", "pequeno porte", "Magazine Luiza", "clara Magazine Luiza S/A", 61982191870, "magazine@magazine.com", 1000000000, "df", new Date()),
    new Empresa(6, "10000000000000", "pequeno porte", "Magazine Luiza", "clara Magazine Luiza S/A", 61982191870, "magazine@magazine.com", 1000000000, "df", new Date())

  ]

  constructor(
    private router: Router,
    private service: HelloWorldDataService) { }

  ngOnInit(): void {
  }

  novaEmpresa(){
    this.router.navigate(["formularioNovo"])

  }
  editaEmpresa(){
    this.router.navigate(["formularioNovo"])
  }

  getHelloWorld(){
    console.log(this.service.executeHelloWorldBeanService());
    this.service.executeHelloWorldBeanService().subscribe();
    //console.log("getHelloWorld");
  } 


}
