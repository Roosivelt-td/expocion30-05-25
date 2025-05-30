import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,  // Marca como standalone
  imports: [RouterModule],  // Importa RouterModule para router-outlet
  templateUrl: './app.html',
  styleUrls: ['./app.component.css']
})
export class App {
  title = 'frontend';
}
