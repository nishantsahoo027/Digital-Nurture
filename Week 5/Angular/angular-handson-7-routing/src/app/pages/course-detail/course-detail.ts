import { Component, inject } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-course-detail',
  imports: [],
  templateUrl: './course-detail.html',
  styleUrl: './course-detail.css'
})
export class CourseDetail {

  private route = inject(ActivatedRoute);

  id: string | null = '';
  ref: string | null = '';

  constructor() {
    this.route.paramMap.subscribe(params => {
      this.id = params.get('id');
    });

    this.route.queryParamMap.subscribe(params => {
      this.ref = params.get('ref');
    });
  }
}