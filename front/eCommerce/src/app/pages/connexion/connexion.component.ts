import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-connexion',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.css']
})
export class ConnexionComponent implements OnInit {

  signinForm: FormGroup;

  constructor(private fb: FormBuilder) { 
    this.signinForm = this.fb.group({
      email: '',
      password: ''
    })
  }

  ngOnInit(): void {
  }

  signIn(){

  }

}
