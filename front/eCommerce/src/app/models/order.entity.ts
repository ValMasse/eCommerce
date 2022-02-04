import { Delivery } from "./delivery.entity";
import { User } from "./user.entity";

export class Order {

    id: string;
    reference: string;
    created_at: Date;
    deliveries: Delivery[];
    user: User;

    constructor(id: string, reference: string, created_at: Date, deliveries: Delivery[], user: User){
        this.id = id;
        this.reference = reference;
        this.created_at = created_at;
        this.deliveries = deliveries;
        this.user = user;
    }
}