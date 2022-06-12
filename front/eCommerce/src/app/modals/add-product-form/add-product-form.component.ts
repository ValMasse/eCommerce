import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Category } from 'src/app/models/category.entity';
import { CategorieService } from 'src/app/services/categorie.service';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-add-product-form',
  templateUrl: './add-product-form.component.html',
  styleUrls: ['./add-product-form.component.css']
})
export class AddProductFormComponent implements OnInit {

  addProductForm: FormGroup;
  categories: Category[] = [];

  closeResult = '';

  constructor(private fb: FormBuilder,
    private categoryService: CategorieService,
    private productService: ProductService,
    private modalService: NgbModal
    ) { 
    this.addProductForm = this.fb.group({
      name: ['', Validators.required],
      description: ['', Validators.required],
      img: ['', Validators.required],
      category: this.fb.group({
        id: ''
      })
    })
  }

  ngOnInit(): void {
    this.getCategories();
  }


  getCategories(){
    return this.categoryService.findAll().subscribe((data) => {
      this.categories = data;
      console.log(data);
    })
  }

  onSubmit(): void {
    console.log("formulaire: ", this.addProductForm.value);
    this.productService.create(this.addProductForm.value).subscribe({
      next: (data) => {

      }
    });
  }

  

}
