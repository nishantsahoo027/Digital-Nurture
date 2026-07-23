import { CanDeactivateFn } from '@angular/router';

export interface CanComponentDeactivate {
  canDeactivate: () => boolean;
}

export const unsavedGuard: CanDeactivateFn<CanComponentDeactivate> = (component) => {
  return component.canDeactivate();
};