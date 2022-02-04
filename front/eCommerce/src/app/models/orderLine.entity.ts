import { Order } from "./order.entity";
import { Product } from "./product.entity";

export class OrderLine {

    id: string;
    order: Order;
    product: Product;

    constructor(id: string, order: Order, product: Product){
        this.id = id;
        this.order = order;
        this.product = product;
    }
}