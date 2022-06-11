import {Component, OnInit} from '@angular/core';
import {ViewportScroller} from "@angular/common";

@Component({
  selector: 'app-meaning-of-life',
  templateUrl: './meaning-of-life.component.html',
  styleUrls: ['./meaning-of-life.component.css']
})
export class MeaningOfLifeComponent implements OnInit {

  constructor(private viewportScroller: ViewportScroller) {
  }

  ngOnInit(): void {
  }

  public onClick(elementId: string): void {
    this.viewportScroller.scrollToAnchor(elementId);
  }
}
