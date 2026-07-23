import { Component } from '@angular/core';

@Component({
  selector: 'app-enrollment',
  imports: [],
  templateUrl: './enrollment.html',
  styleUrl: './enrollment.css'
})
export class Enrollment {

  hasUnsavedChanges = true;

  canDeactivate(): boolean {

    if (this.hasUnsavedChanges) {
      return confirm('You have unsaved changes. Do you really want to leave?');
    }

    return true;
  }

}