import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {catchError, Observable, throwError} from "rxjs";
import {User} from "../User";

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
  userUrl = `/rest/user`


  constructor(private http: HttpClient) {
  }

  getRegistrations(): Observable<User[]> {
    return this.http.get<User[]>(this.userUrl)
  }

  addRegistartion(user: User): Observable<User> {
    return this.http.post<User>(this.userUrl, user)
      .pipe(catchError((err) => {
        console.log('error caught in service')
        console.error(err);
        return throwError(err);
      }))
  }
}
