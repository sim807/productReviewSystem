import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RequestReviewsComponent } from './request-reviews.component';

describe('RequestReviewsComponent', () => {
  let component: RequestReviewsComponent;
  let fixture: ComponentFixture<RequestReviewsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RequestReviewsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RequestReviewsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
