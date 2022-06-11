import { TestBed } from '@angular/core/testing';

import { ReadMessageService } from './read-message.service';

describe('ReadMessageService', () => {
  let service: ReadMessageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ReadMessageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
