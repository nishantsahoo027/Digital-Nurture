import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-enrollment-form',
  imports: [CommonModule, FormsModule],
  templateUrl: './enrollment-form.html',
  styleUrl: './enrollment-form.css'
})
export class EnrollmentForm {

  enrollment = {
    studentName: '',
    email: '',
    courseId: '',
    agree: false
  };

  submitted = false;

  onSubmit() {
    this.submitted = true;
    console.log(this.enrollment);
  }

}