import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaEmpresaComponent } from './lista-empresa/lista-empresa.component';
import { FormEmpresaComponent } from './form-empresa/form-empresa.component';
import { ErroComponent } from './erro/erro.component';
import { FooterComponent } from './footer/footer.component';
import { FormsModule } from '@angular/forms';


import { MenuComponent } from './menu/menu.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ListaEmpresaComponent,
    FormEmpresaComponent,
    ErroComponent,
    FooterComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
