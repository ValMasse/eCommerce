import { Product } from "./product.entity";

export class Category {

    id: string;
    name: string;
    image: string;
    products:Product[];

    constructor(id: string, name: string, image: string, products: Product[]){
        this.id = id;
        this.name = name;
        this.image = image;
        this.products = products;
    }

}