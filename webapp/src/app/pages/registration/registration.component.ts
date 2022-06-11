import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, ValidationErrors, Validators} from "@angular/forms";

import {User} from "../User";
import {RegistrationService} from "./registration.service";
import {HttpClient} from "@angular/common/http";


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  providers: [RegistrationService],
  styleUrls: ['./registration.component.css']
})

export class RegistrationComponent implements OnInit {
  users: User[] = [];
  editUser: User | undefined; // the hero currently being edited
  email = "";
  password = "";
  nickname = "";
  registrationUrl = `/rest/user`

  validateForm!: FormGroup;

  constructor(private fb: FormBuilder, private registrationService: RegistrationService, private http: HttpClient) {
  }

  ngOnInit(): void {
    this.validateForm = this.fb.group({
      email: [null, [Validators.email, Validators.required]],//, this.uniqueEmail.bind(this)
      password: [null, [Validators.required]],
      checkPassword: [null, [Validators.required, this.confirmationValidator]],
      nickname: [null, [Validators.required]],
    });
    this.getRegistrations();
  }

  getRegistrations(): void {
    this.registrationService.getRegistrations()
      .subscribe(users => (this.users = users));
  }

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

  updateConfirmValidator(): void {
    /** wait for refresh value */
    Promise.resolve().then(() => this.validateForm.controls['checkPassword'].updateValueAndValidity());
  }

  confirmationValidator = (control: FormControl): { [s: string]: boolean } => {
    if (!control.value) {
      return {required: true};
    } else if (control.value !== this.validateForm.controls['password'].value) {
      return {confirm: true, error: true};
    }
    return {};
  };

  add(email: string, password: string, nickname: string): void {
    // this.clickVerify = true;
    email = email.trim();
    password = password.trim();
    nickname = nickname.trim();
    if (!email && !password && !nickname) {
      return;
    }

    // The server will generate the id for this new user
    const newUser: User = {email, password, nickname} as User;
    this.registrationService
      .addRegistartion(newUser)
      .subscribe(user => this.users.push(user));
  }

}
