import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Empresa } from 'src/app/lista-empresa/lista-empresa.component';

@Injectable({
  providedIn: 'root'
})

export class EmpresaService {


  constructor(private http:HttpClient) { }

  Url = 'http://localhost:8080/empresas';

  getEmpresas(){
    return this.http.get<Empresa[]>(this.Url);
  }
}
