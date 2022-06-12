import {Component, OnInit} from '@angular/core';
import {SendMessageService} from "./send-message.service";
import {User} from "../../User";
import {Message} from "../../Message";
import {RegistrationService} from "../../registration/registration.service";

@Component({
  selector: 'app-send-message',
  templateUrl: './send-message.component.html',
  styleUrls: ['./send-message.component.css']
})
export class SendMessageComponent implements OnInit {
  messages: Message[] = [];
  user: User[] = [];
  title="";
  text ="";

  constructor(private sendMessageService: SendMessageService,private registrationService: RegistrationService,) {
  }

  ngOnInit(): void {
  }

  add(title: string, text: string, user: object): void {
    // this.clickVerify = true;
    title = title.trim();
    text = text.trim();
    // user = user.trim();
    if (!title && !text && !user) {
      return;
    }

    // The server will generate the id for this new message
    const newMessage: Message = {title: title, text: text, user: user} as Message;
    this.sendMessageService
      .addMessage(newMessage)
      .subscribe(message => this.messages.push(message));
  }
}
