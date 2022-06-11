import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TestBekaComponent } from './test-beka.component';

describe('TestBekaComponent', () => {
  let component: TestBekaComponent;
  let fixture: ComponentFixture<TestBekaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TestBekaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TestBekaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
