import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PateNotFoundComponent } from './pate-not-found.component';

describe('PateNotFoundComponent', () => {
  let component: PateNotFoundComponent;
  let fixture: ComponentFixture<PateNotFoundComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PateNotFoundComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PateNotFoundComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
