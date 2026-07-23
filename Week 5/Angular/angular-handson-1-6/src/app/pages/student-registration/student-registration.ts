import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-student-registration',
  imports: [CommonModule, FormsModule],
  templateUrl: './student-registration.html',
  styleUrl: './student-registration.css'
})
export class StudentRegistration {

  student = {
    name: '',
    email: '',
    phone: '',
    course: ''
  };

  onSubmit() {
    alert('Registration Successful!');
    console.log(this.student);
  }

}