import { Component } from '@angular/core';

import {subscribeOn} from "rxjs";
import {PersonnesService} from "../personnes.service";

@Component({
  selector: 'app-personnes',
  templateUrl: './personnes.component.html',
  styleUrls: ['./personnes.component.css']
})
export class PersonnesComponent {

  personnes:any;
  displayedColumns: string[] = ['id', 'firstname', 'secondname', 'age', 'action'];
  dataSource:any;

  constructor(private personnesService:PersonnesService) {

  }

  ngOnInit(){
    this.personnesService.getAllData()
    .subscribe(response => {
      this.personnes=response;
      console.log(this.personnes);
      this.dataSource = this.personnes;
    })
  }



}
