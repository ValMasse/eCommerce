import { Category } from "./category.entity";
import { Order } from "./order.entity";

export class Product {

    id: string;
    name: string;
    description: string;
    img: string;
    order: Order;
    category: Category;

    constructor(id: string, name: string, description: string, img: string, order: Order, category: Category){
        this.id = id;
        this.name = name;
        this.description = description;
        this.img = img;
        this.order = order;
        this.category = category;
    }

}