import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TestZangaComponent } from './test-zanga.component';

describe('TestZangaComponent', () => {
  let component: TestZangaComponent;
  let fixture: ComponentFixture<TestZangaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TestZangaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TestZangaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
