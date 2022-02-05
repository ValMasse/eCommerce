import { Component, OnInit } from '@angular/core';
import { Category } from 'src/app/models/category.entity';
import { CategorieService } from 'src/app/services/categorie.service';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {

  categories: Category[] = [];

  constructor(private service: CategorieService) { }

  ngOnInit(): void {
    this.findAll();
  }

  findAll(){
    this.service.findAll().subscribe(data => {
      this.categories = data;
    });
    console.log(this.service.findAll());
  }

}
