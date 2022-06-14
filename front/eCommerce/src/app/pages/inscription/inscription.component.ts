import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-inscription',
  templateUrl: './inscription.component.html',
  styleUrls: ['./inscription.component.css']
})
export class InscriptionComponent implements OnInit {

  subscriptionForm: FormGroup;


  constructor(private fb: FormBuilder,
    private userService: UserService
    ) { 
    this.subscriptionForm = this.fb.group({
      firstname: '',
      lastname: '',
      email: '',
      password: ''
    })
  }

  ngOnInit(): void {
  }

  register(){
    console.log(this.subscriptionForm.value);
    this.userService.create(this.subscriptionForm.value).subscribe((data) => {});
  }

}
