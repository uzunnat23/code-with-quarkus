import {Component, OnInit} from '@angular/core';
import {NzModalService} from "ng-zorro-antd/modal";

@Component({
  selector: 'app-test-beka',
  templateUrl: './test-beka.component.html',
  styleUrls: ['./test-beka.component.css']
})
export class TestBekaComponent implements OnInit {
  current = 0;
  index = 'Я чувствую себя более нервным(-ой) и тревожным, чем обычно.';
  radioValue = 'A';
  result = 0;
  output = '';

  constructor(private modal: NzModalService) {
  }

  ngOnInit(): void {
  }

  counter(c: number) {
    return new Array(c);
  }

  pre(): void {
    this.current -= 1;
    this.changeContent();
  }

  next(): void {
    this.current += 1;
    this.changeContent();
    this.caseOfTest();
  }

  done(): void {
    console.log('done');
    this.outputOfTestResult();
    this.modal.info({
      nzTitle: 'Result',
      nzContent:  this.output,
      nzOnOk: () => console.log('Info OK')
    });
  }

  caseOfTest(): void {
    if (this.current == 3 ||
      this.current == 8 ||
      this.current == 12 ||
      this.current == 16 ||
      this.current == 18) {
      switch (this.radioValue) {
        case "A": {
          this.result += 4;
          break;
        }
        case "B": {
          this.result += 3;
          break;
        }
        case "C": {
          this.result += 2;
          break;
        }
        case "D": {
          this.result++;
          break;
        }
      }
    } else {
      switch (this.radioValue) {
        case "A": {
          this.result++;
          break;
        }
        case "B": {
          this.result += 2;
          break;
        }
        case "C": {
          this.result += 3;
          break;
        }
        case "D": {
          this.result += 4;
          break;
        }
      }
    }
  }

  outputOfTestResult(): void {
    if (this.result < 45) {
      this.output = "Вы набрали " + this.result + " баллов.\n У вас нет расстройсв.";
    } else if (this.result > 45 && this.result < 60) {
      this.output = "Вы набрали " + this.result + " баллов.\n У вас легкое тревожное расстройсво или тревожное расстройсво средней степени тяжести.";
    } else if (this.result > 61 && this.result < 75) {
      this.output = "Вы набрали " + this.result + " баллов.\n У вас выраженное тревожное расстройсво или тревожное расстройсво тяжелой степени тяжести.";
    } else {
      this.output = "Вы набрали " + this.result + " баллов.\n У вас тревожное расстройсво крайне тяжелой степени тяжести.";
    }
  }

  changeContent(): void {
    switch (this.current) {
      case 0: {
        this.index = 'Я чувствую себя более нервным(-ой) и тревожным, чем обычно.';
        break;
      }
      case 1: {
        this.index = 'Я испытываю чувство страха совершенно без причины.';
        break;
      }
      case 2: {
        this.index = 'Я легко огорчаюсь или впадаю в панику.';
        break;
      }
      case 3: {
        this.index = 'У меня ощущение, что я не могу собраться и взять себя в руки.';
        break;
      }
      case 4: {
        this.index = 'У меня ощущение благополучия, я чувствую, что со мной не случится ничего плохого.';
        break;
      }
      case 5: {
        this.index = 'Мои руки и ноги дрожат и трясутся.';
        break;
      }
      case 6: {
        this.index = 'У меня бывают головные боли, боли в шее и спине.';
        break;
      }
      case 7: {
        this.index = 'Я чувствую разбитость и быстро устаю.';
        break;
      }
      case 8: {
        this.index = 'Я спокоен(-а) и не суетлив(-а).';
        break;
      }
      case 9: {
        this.index = 'У меня бывает ощущение учащенного сердцебиения.';
        break;
      }
      case 10: {
        this.index = 'У меня бывают приступы головокружения.';
        break;
      }
      case 11: {
        this.index = 'У меня бывают обмороки или я чувствую, что могу потерять сознание.';
        break;
      }
      case 12: {
        this.index = 'Я дышу свободно.';
        break;
      }
      case 13: {
        this.index = 'Я испытываю ощущение онемения и покалывания в пальцах рук и ног.';
        break;
      }
      case 14: {
        this.index = 'У меня бывают боли в желудке и расстройства пищеварения.';
        break;
      }
      case 15: {
        this.index = 'У меня бывают внезапные позывы к мочеиспусканию.';
        break;
      }
      case 16: {
        this.index = 'Мои руки сухие и теплые.';
        break;
      }
      case 17: {
        this.index = 'Мое лицо "горит" и краснеет.';
        break;
      }
      case 18: {
        this.index = 'Я легко засыпаю и утром просыпаюсь отдохнувшим (-ой).';
        break;
      }
      case 19: {
        this.index = 'Меня мучают ночные кошмары.';
        break;
      }
      default: {
        this.index = 'Ошибка';
      }
    }
  }
}
