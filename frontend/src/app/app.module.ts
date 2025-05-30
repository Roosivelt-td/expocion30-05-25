import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { App } from './app';
import { UsuarioListComponent } from './components/usuario-list/usuario-list.component';

@NgModule({
  declarations: [
    // App,
    // UsuarioListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    UsuarioListComponent,
    App
  ],
  providers: [],
 // bootstrap: [App]
})
export class AppModule { }
