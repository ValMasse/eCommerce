import { Address } from "./address.entity";
import { Order } from "./order.entity";

export class Delivery {
    
    id: string;
    created_at:Date;
    is_devlivered: boolean;
    address: Address;
    order: Order;

    constructor(id: string, created_at:Date, is_devlivered: boolean, address: Address, order: Order){
        this.id = id;
        this.created_at = created_at;
        this.is_devlivered = is_devlivered;
        this.address = address;
        this.order = order;
    }
}