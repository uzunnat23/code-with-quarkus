export class User {

  private _email: string;
  private _password: string;
  private _nickname: string;

  constructor(email: string, password: string, nickname: string) {
    this._email = email;
    this._password = password;
    this._nickname = nickname;
  }


  set email(value: string) {
    this._email = value;
  }

  set password(value: string) {
    this._password = value;
  }

  set nickname(value: string) {
    this._nickname = value;
  }

  get email(): string {
    return this._email;
  }

  get password(): string {
    return this._password;
  }

  get nickname(): string {
    return this._nickname;
  }
}
