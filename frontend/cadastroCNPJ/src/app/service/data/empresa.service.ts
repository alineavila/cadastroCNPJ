import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Empresa } from 'src/app/lista-empresa/lista-empresa.component';

@Injectable({
  providedIn: 'root'
})

export class EmpresaService {

  Url = 'http://localhost:8080/empresa/';
  constructor(private http:HttpClient) { }

  

  getEmpresas(){
    return this.http.get<Empresa[]>(this.Url + 'lista');
  }
}
