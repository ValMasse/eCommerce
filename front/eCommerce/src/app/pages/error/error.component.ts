import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-error',
  templateUrl: './error.component.html',
  styleUrls: ['./error.component.css']
})
export class ErrorComponent implements OnInit {

  constructor(private router: Router) { }

  public timer: number = 10000;

  ngOnInit(): void {

    setTimeout(() => {
        this.router.navigateByUrl("/home");
    }, this.timer);
  }



}
