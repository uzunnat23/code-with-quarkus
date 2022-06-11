import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SelfEsteemComponent } from './self-esteem.component';

describe('SelfEsteemComponent', () => {
  let component: SelfEsteemComponent;
  let fixture: ComponentFixture<SelfEsteemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SelfEsteemComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SelfEsteemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
