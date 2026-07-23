import { Routes } from '@angular/router';
import { Home } from './pages/home/home';
import { CourseList } from './pages/course-list/course-list';
import { CourseDetail } from './pages/course-detail/course-detail';
import { StudentProfile } from './pages/student-profile/student-profile';
import { authGuard } from './guards/auth-guard';
import { unsavedGuard } from './guards/unsaved-guard';

export const routes: Routes = [
  {
    path: '',
    component: Home
  },
  {
    path: 'courses',
    component: CourseList,
    children: [
      {
        path: ':id',
        component: CourseDetail
      }
    ]
  },
  {
    path: 'profile',
    component: StudentProfile,
    canActivate: [authGuard]
  },
{
  path: 'enrollment',
  loadComponent: () =>
    import('./pages/enrollment/enrollment')
      .then(m => m.Enrollment),
  canDeactivate: [unsavedGuard]
},
  {
    path: '**',
    redirectTo: ''
  }
];