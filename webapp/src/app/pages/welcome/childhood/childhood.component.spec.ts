import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildhoodComponent } from './childhood.component';

describe('ChildhoodComponent', () => {
  let component: ChildhoodComponent;
  let fixture: ComponentFixture<ChildhoodComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChildhoodComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildhoodComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
