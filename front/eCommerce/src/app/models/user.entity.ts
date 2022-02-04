import { Address } from "./address.entity";
import { Order } from "./order.entity";

export class User {

    id: string;
    firstname: string;
    lastname: string;
    email: string;
    password: string;
    orders: Order[];
    addresses: Address[];

    constructor(id: string, firstname: string, lastname: string, email: string, password: string, orders: Order[], addresses: Address[]){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.orders = orders;
        this.addresses = addresses;
    }
    
}