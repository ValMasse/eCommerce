import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Product } from '../models/product.entity';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }

  public findAll(){
    return this.http.get<Product[]>(`${environment.apiUrl}/products`);
  }

  public create(product: Product){
    return this.http.post<Product>(`${environment.apiUrl}/products/`, product);
  }

  
}
