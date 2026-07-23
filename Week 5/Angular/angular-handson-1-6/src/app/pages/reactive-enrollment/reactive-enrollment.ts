import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import {
  FormBuilder,
  FormGroup,
  ReactiveFormsModule,
  Validators
} from '@angular/forms';

@Component({
  selector: 'app-reactive-enrollment',
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './reactive-enrollment.html',
  styleUrl: './reactive-enrollment.css'
})
export class ReactiveEnrollment {

  enrollmentForm: FormGroup;
  submitted = false;

  constructor(private fb: FormBuilder) {

    this.enrollmentForm = this.fb.group({
      studentName: ['', [Validators.required, Validators.minLength(3)]],
      email: ['', [Validators.required, Validators.email]],
      courseId: ['', Validators.required],
      agree: [false, Validators.requiredTrue]
    });

  }

  onSubmit(): void {
    if (this.enrollmentForm.valid) {
      this.submitted = true;
      console.log(this.enrollmentForm.value);
    }
  }

}