
import { TestBed } from '@angular/core/testing';

import { ReadMessageGuard } from './read-message.guard';

describe('SendMessageGuard', () => {
  let guard: ReadMessageGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(ReadMessageGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
