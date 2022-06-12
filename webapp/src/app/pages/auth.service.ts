import {Injectable} from '@angular/core';

import {Observable, of} from 'rxjs';
import {tap, delay} from 'rxjs/operators';
import {User} from "./User";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  user: User[] = [];
  isUserLoggedIn: boolean = false;
  isAdmin: boolean = false;
  userUrl = `/rest/user`
  email = "";
  password = "";

  constructor(private http: HttpClient) {
  }

  login(email: string, password: string): Observable<any> {
    const userUrl = `${this.userUrl}/${email}`
    const test = this.http.get<User[]>(userUrl);

    console.log(userUrl);
    console.log(email);
    console.log(password);

    test.subscribe(user => this.user = user)
    // @ts-ignore
    this.isUserLoggedIn = email == this.user.email && password == this.user.password;
    this.isAdmin = email == "admin@gmail.com" && password == "admin"
    console.log(this.isAdmin);
    localStorage.setItem('isUserLoggedIn', this.isUserLoggedIn ? "true" : "false");
    return of(this.isUserLoggedIn).pipe(
      delay(1000),
      tap(val => {
        console.log("Is User Authentication is successful: " + val);
      })
    );
    // window.location.reload();
  }

  logout(): void {
    this.isUserLoggedIn = false;
    localStorage.removeItem('isUserLoggedIn');
    // window.location.reload();
  }
}
