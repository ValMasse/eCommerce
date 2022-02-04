import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Category } from '../models/category.entity';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CategorieService {

  constructor(private http: HttpClient) { }

  public findAll(){
    return this.http.get<Category[]>(`${environment.apiUrl}/categories`);
  }

  public findById(id: string){
    return this.http.get<Category>(`${environment.apiUrl}/categories/${id}`);
  }

  public create(category: Category){
    return this.http.post<Category>(`${environment.apiUrl}/categories/`, category);
  }

  public update(id: string, category: Category){
    return this.http.put<Category>(`${environment.apiUrl}/categories/${id}`, category);
  }

  public delete(id: string){
    return this.http.delete<Category>(`${environment.apiUrl}/categories/${id}`);
  }


}
