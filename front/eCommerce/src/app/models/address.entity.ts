import { Delivery } from "./delivery.entity";
import { User } from "./user.entity";

export class Address {

    id: string;
    number: number;
    street: string;
    zipcode: string;
    city: string;
    country: string;
    user: User;
    deliveries: Delivery[];

    constructor(id: string, number: number, street: string, zipcode: string, city: string, country: string, user: User, deliveries: Delivery[]){
        this.id = id;
        this.number = number;
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
        this.country = country;
        this.user = user;
        this.deliveries = deliveries;
    }
}