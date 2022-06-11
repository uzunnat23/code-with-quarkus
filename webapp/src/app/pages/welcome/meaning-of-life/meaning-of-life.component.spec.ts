import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MeaningOfLifeComponent } from './meaning-of-life.component';

describe('MeaningOfLifeComponent', () => {
  let component: MeaningOfLifeComponent;
  let fixture: ComponentFixture<MeaningOfLifeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MeaningOfLifeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MeaningOfLifeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
