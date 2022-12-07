import { Component } from '@angular/core';
import {PersonnesService} from "../personnes.service";

@Component({
  selector: 'app-addpersonne',
  templateUrl: './addpersonne.component.html',
  styleUrls: ['./addpersonne.component.css']
})
export class AddpersonneComponent {

  constructor(private personnesService:PersonnesService) {

  }

  addPersonne(personne: any){
    let per = {
      firstname: 'baddi',
      secondname: 'youssef',
      age: 26
    };

    console.log(personne);

    this.personnesService.addPersonne(per).subscribe(response => {
      console.log(response);
    })
  }

}
