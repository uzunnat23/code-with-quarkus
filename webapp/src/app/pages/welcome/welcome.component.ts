import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {
  imageSrc = 'assets/images/welcome_img.jpg'
  imageAlt = 'Welcome Image'
  constructor() {

  }

  ngOnInit() {
  }

}
