import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Empresa } from 'src/app/lista-empresa/lista-empresa.component';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class EmpresaService {

  Url = 'http://localhost:8080/empresa/';

  constructor(private http:HttpClient) { }

  

  getEmpresas(){
    return this.http.get<Empresa[]>(this.Url + 'lista');
  }


  getOneEmpresas(id: number){
    return this.http.get<Empresa>(this.Url + `detail/${id}`);
  }

  save(empresa: Empresa): Observable<any> {
    return this.http.post<any>(this.Url + 'create', empresa);
  }

  update(id: number, empresa: Empresa): Observable<any> {
    return this.http.put<any>(this.Url + `update/${id}`, empresa);
  }

  delete(id: number): Observable<any> {
    return this.http.delete<any>(this.Url + `${id}`);
  }


}
