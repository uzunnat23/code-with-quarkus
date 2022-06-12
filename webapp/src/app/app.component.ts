import {Component} from '@angular/core';
import {FormGroup} from "@angular/forms";
import {AuthService} from "./pages/auth.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  validateForm!: FormGroup;
  isCollapsed = false;
  isVisible = false;
  isUserLoggedIn = false;

  isAdmin = true;

  submitForm(): void {
    if (this.validateForm.valid) {
      console.log('submit', this.validateForm.value);
    } else {
      Object.values(this.validateForm.controls).forEach(control => {
        if (control.invalid) {
          control.markAsDirty();
          control.updateValueAndValidity({onlySelf: true});
        }
      });
    }
  }

  constructor(private authService: AuthService) {
  }

  ngOnInit() {
    let storeData = localStorage.getItem("isUserLoggedIn");
    console.log("StoreData: " + storeData);


    if (storeData != null && storeData == "true") {
      this.isUserLoggedIn = true;
    } else
      this.isUserLoggedIn = false;
    console.log("Is Admin: " + this.authService.isAdmin);
  }

}
