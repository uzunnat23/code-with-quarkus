import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {AuthService} from "../auth.service";
import {LoginService} from "./login.service";
import {Router} from "@angular/router";
import {User} from "../User";


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  validateForm!: FormGroup;
  user: User[] = [];
  isVisible = false;
  email = "";
  password = "";
  formData!: FormGroup;
  userUrl = `/rest/user/${this.email}`

  constructor(private fb: FormBuilder, private loginService: LoginService, private authService: AuthService, private router: Router) {
  }

  ngOnInit(): void {
    this.validateForm = this.fb.group({
      email: [null, [Validators.email, Validators.required]],//, this.uniqueEmail.bind(this)
      password: [null, [Validators.required]],
    });

  }

  submitForm(data: any): void {
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

    this.email = data.email;
    this.password = data.password;

    console.log("Login page: " + this.email);
    console.log("Login page: " + this.password);
    console.log("Admin: " + this.authService.isAdmin);

    this.authService.login(this.email, this.password)
      .subscribe(data => {
        console.log("Is Login Success: " + data);

        if (data) this.router.navigate(['/welcome']);

      });
  }


}
