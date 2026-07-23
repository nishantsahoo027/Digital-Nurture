import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-course-list',
  imports: [CommonModule, RouterLink, RouterOutlet],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList {

  courses = [
    { id: 101, name: 'Angular' },
    { id: 102, name: 'Java' },
    { id: 103, name: 'Spring Boot' }
  ];

}