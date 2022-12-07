import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable} from "rxjs";


@Injectable({
  providedIn: 'root'
})
export class PersonnesService {

  private url = 'http://localhost:8080/cours-jersey/webapi/personnes';
  constructor(private httpClient:HttpClient) { }

  getAllData(): Observable<any>{
    return this.httpClient.get(this.url)
  }

  addPersonne(personne: any): Observable<any>{
    // TODO : add personne service function
    return this.httpClient.post(this.url, personne)
  }

  editPersonne(): Observable<any>{
    // TODO : add personne service function
    return this.httpClient.get(this.url)
  }

  deletePersonne(): Observable<any>{
    // TODO : add personne service function
    return this.httpClient.get(this.url)
  }
}
