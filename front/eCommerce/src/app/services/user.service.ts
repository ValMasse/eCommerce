import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { User } from '../models/user.entity';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  public findAll(){
    return this.http.get<User[]>(`${environment.apiUrl}/users`);
  }
  
  public create(user: User){
    return this.http.post<User>(`${environment.apiUrl}/users/`, user);
  }

  public findById(id: string){
    return this.http.get<User>(`${environment.apiUrl}/users/${id}`);
  }

}
