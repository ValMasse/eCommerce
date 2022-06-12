import { Component, OnInit } from '@angular/core';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { AddProductFormComponent } from 'src/app/modals/add-product-form/add-product-form.component';
import { Product } from 'src/app/models/product.entity';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  products: Product[] = [];

  constructor(private modalService: NgbModal,
    private productService: ProductService
    ) { }

  ngOnInit(): void {
    this.initProducts();
  }

  open() {
    const modal = this.modalService.open(AddProductFormComponent, {
      size : 'lg',
    });
    
  }
  
  initProducts(){
    this.productService.findAll().subscribe((data) => {
      this.products = data;
      console.log(data);
    })
  }

}
