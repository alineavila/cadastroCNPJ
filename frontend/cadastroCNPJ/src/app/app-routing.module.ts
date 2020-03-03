import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListaEmpresaComponent } from './lista-empresa/lista-empresa.component';
import { FormEmpresaComponent } from './form-empresa/form-empresa.component';
import { ErroComponent } from './erro/erro.component';


const routes: Routes = [
  {path: "", component: ListaEmpresaComponent}, // rota padrão da aplicação
  {path: "formularioNovo", component: FormEmpresaComponent},
  {path: "editar/:id", component: FormEmpresaComponent},
  {path: "**", component: ErroComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
