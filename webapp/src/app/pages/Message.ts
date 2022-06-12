export class Message {


  private _id :number;
  private _title: string;
  private _text: string;
  private _user: object;


  constructor(id: number, title: string, text: string, user: object) {
    this._id = id;
    this._title = title;
    this._text = text;
    this._user = user;
  }

  get id(): number {
    return this._id;
  }

  set id(value: number) {
    this._id = value;
  }

  get title(): string {
    return this._title;
  }

  set title(value: string) {
    this._title = value;
  }

  get text(): string {
    return this._text;
  }

  set text(value: string) {
    this._text = value;
  }

  get user(): any {
    return this._user;
  }

  set user(value: any) {
    this._user = value;
  }

}
