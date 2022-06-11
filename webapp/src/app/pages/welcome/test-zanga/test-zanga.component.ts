import {Component, OnInit} from '@angular/core';
import {NzModalService} from "ng-zorro-antd/modal";

@Component({
  selector: 'app-test-zanga',
  templateUrl: './test-zanga.component.html',
  styleUrls: ['./test-zanga.component.css']
})
export class TestZangaComponent implements OnInit {
  current = 0;
  index = 'Я жду будущего с надеждой и энтузиазмом.';
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
      nzContent: this.output,
      nzOnOk: () => console.log('Info OK')
    });
  }

  caseOfTest(): void {
    if (this.current == 0 ||
      this.current == 2 ||
      this.current == 4 ||
      this.current == 5 ||
      this.current == 7 ||
      this.current == 9 ||
      this.current == 12 ||
      this.current == 14 ||
      this.current == 19) {
      switch (this.radioValue) {
        case "A": {
          break;
        }
        case "B": {
          this.result ++;
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
          break;
        }
      }
    }
  }

  outputOfTestResult(): void {
    if (this.result < 4) {
      this.output = "Вы набрали " + this.result + " баллов.\n Безнадёжность не выявлена.";
    } else if (this.result > 3 && this.result < 9) {
      this.output = "Вы набрали " + this.result + " баллов.\n Безнадежность лёгкая.";
    } else if (this.result > 8 && this.result < 14) {
      this.output = "Вы набрали " + this.result + " баллов.\n Безнадежность умеренная.";
    } else {
      this.output = "Вы набрали " + this.result + " баллов.\n Безнадежность тяжёлая.";
    }
  }

  changeContent(): void {
    switch (this.current) {
      case 0: {
        this.index = 'Я жду будущего с надеждой и энтузиазмом.';
        break;
      }
      case 1: {
        this.index = 'Мне пора сдаться, т.к. я ничего не могу изменить к лучшему';
        break;
      }
      case 2: {
        this.index = 'Когда дела идут плохо, мне помогает мысль, что так не может продолжаться всегда.';
        break;
      }
      case 3: {
        this.index = 'Я не могу представить, на что будет похожа моя жизнь через 10 лет.';
        break;
      }
      case 4: {
        this.index = 'У меня достаточно времени, чтобы завершить дела, которыми я больше всего хочу заниматься.';
        break;
      }
      case 5: {
        this.index = 'В будущем, я надеюсь достичь успеха в том, что мне больше всего нравится.';
        break;
      }
      case 6: {
        this.index = 'Будущее представляется мне во тьме.';
        break;
      }
      case 7: {
        this.index = 'Я надеюсь получить в жизни больше хорошего, чем средний человек.';
        break;
      }
      case 8: {
        this.index = 'У меня нет никаких просветов и нет причин верить, что они появятся в будущем.';
        break;
      }
      case 9: {
        this.index = 'Мой прошлый опыт хорошо меня подготовил к будущему.';
        break;
      }
      case 10: {
        this.index = 'Всё, что я вижу впереди - скорее, неприятности, чем радости.';
        break;
      }
      case 11: {
        this.index = 'Я не надеюсь достичь того, чего действительно хочу.';
        break;
      }
      case 12: {
        this.index = 'Когда я заглядываю в будущее, я надеюсь быть счастливее, чем я есть сейчас.';
        break;
      }
      case 13: {
        this.index = 'Дела идут не так, как мне хочется.';
        break;
      }
      case 14: {
        this.index = 'Я сильно верю в своё будущее.';
        break;
      }
      case 15: {
        this.index = 'Я никогда не достигаю того, что хочу, поэтому глупо что-либо хотеть.';
        break;
      }
      case 16: {
        this.index = 'Весьма маловероятно, что я получу реальное удовлетворение в будущем.';
        break;
      }
      case 17: {
        this.index = 'Будущее представляется мне расплывчатым и неопределённым.';
        break;
      }
      case 18: {
        this.index = 'В будущем меня ждёт больше хороших дней, чем плохих.';
        break;
      }
      case 19: {
        this.index = 'Бесполезно пытаться получить то, что я хочу, потому, что, вероятно, я не добьюсь этого.';
        break;
      }
      default: {
        this.index = 'Ошибка';
      }
    }
  }
}
