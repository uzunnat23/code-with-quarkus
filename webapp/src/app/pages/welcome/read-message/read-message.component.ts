import { Component, OnInit } from '@angular/core';
import {Message} from "../../Message";
import {ReadMessageService} from "./read-message.service";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-read-message',
  templateUrl: './read-message.component.html',
  styleUrls: ['./read-message.component.css']
})
export class ReadMessageComponent implements OnInit {
  messages: Message[] = [];
  messageUrl = `/rest/message`


  constructor(private readMessageService:ReadMessageService, private http: HttpClient) { }

  ngOnInit(): void {
    this.getMessages();
  }

  getMessages(): void {

    this.readMessageService.getMessages()
      // @ts-ignore
      .subscribe(messages => this.messages = messages);
  }





}
