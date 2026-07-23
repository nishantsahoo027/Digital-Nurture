import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  constructor() { }

  private courses = [
    { id: 1, name: 'Angular', code: 'ANG101', credits: 4, gradeStatus: 'passed' },
    { id: 2, name: 'Java', code: 'JAVA101', credits: 3, gradeStatus: 'failed' },
    { id: 3, name: 'Spring Boot', code: 'SB101', credits: 4, gradeStatus: 'pending' },
    { id: 4, name: 'SQL', code: 'SQL101', credits: 2, gradeStatus: 'passed' },
    { id: 5, name: 'Microservices', code: 'MS101', credits: 4, gradeStatus: 'pending' }
  ];

  getCourses() {
    return this.courses;
  }

}