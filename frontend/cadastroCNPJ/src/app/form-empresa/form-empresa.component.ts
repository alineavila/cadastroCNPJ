import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmpresaService } from '../service/data/empresa.service';
import { Empresa } from '../lista-empresa/lista-empresa.component';

@Component({
  selector: 'app-form-empresa',
  templateUrl: './form-empresa.component.html',
  styleUrls: ['./form-empresa.component.css']
})
export class FormEmpresaComponent implements OnInit {

   cnpj: string;
   tipo: string;
   nome: string;
   razaoSocial: string;
   contato: number;
   email: string;
   cep: number;
   uf: string;
  

  
  constructor(private router: Router, private empresaService: EmpresaService) { }

  ngOnInit(): void {
  }

  listaEmpresa(){
    this.router.navigate([""]);

  }

  novaEmpresa(){
    const empresa = new Empresa(this.cnpj,
      this.tipo,
      this.nome,
      this.razaoSocial, 
      this.contato,
      this.email,
      this.cep,
      this.uf)
    this.empresaService.save(empresa);
    this.router.navigate([""]);


  }
 



}
