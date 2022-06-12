import { Injectable } from '@angular/core';
import {catchError, Observable, throwError} from "rxjs";
import {Message} from "../../Message";
import {HttpClient} from "@angular/common/http";


@Injectable({
  providedIn: 'root'
})
export class SendMessageService {
  messageUrl = `/rest/message`
  errorMessage: [] = [];

  constructor(private http: HttpClient) { }

  getMessage(): Observable<Message[]> {
    return this.http.get<Message[]>(this.messageUrl)
  }

  addMessage(message: Message): Observable<Message> {
    return this.http.post<Message>(this.messageUrl, message)
      .pipe(catchError((err) => {
        console.log('error caught in service')
        console.error(err);
        return throwError(err);
      }))
  }
}
