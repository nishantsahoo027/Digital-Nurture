import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router, RouterOutlet } from '@angular/router';
import { CourseCard } from '../../components/course-card/course-card';
import { CourseService } from '../../services/course';

@Component({
  selector: 'app-course-list',
  imports: [CommonModule, CourseCard, RouterOutlet],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList implements OnInit {

  isLoading = true;

  courses: any[] = [];

  selectedCourseId = 0;

  constructor(
    private courseService: CourseService,
    private router: Router
  ) {}

ngOnInit(): void {

  this.courses = this.courseService.getCourses();

  console.log('Courses:', this.courses);

  this.isLoading = false;

}

  onEnroll(courseId: number): void {
    console.log('Enrolling in course: ' + courseId);
    this.selectedCourseId = courseId;

    this.router.navigate(['/courses', courseId]);
  }

  trackByCourseId(index: number, course: any): number {
    return course.id;
  }

}