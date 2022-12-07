import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {PersonnesComponent} from "./personnes/personnes.component";
import {AddpersonneComponent} from "./addpersonne/addpersonne.component";

const routes: Routes = [
  {path: 'personnes/add', component:AddpersonneComponent},
  {path: 'personnes', component:PersonnesComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
