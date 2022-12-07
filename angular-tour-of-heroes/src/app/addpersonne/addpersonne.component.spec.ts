import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddpersonneComponent } from './addpersonne.component';

describe('AddpersonneComponent', () => {
  let component: AddpersonneComponent;
  let fixture: ComponentFixture<AddpersonneComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddpersonneComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddpersonneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
