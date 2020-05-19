import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TestService {

  constructor() { }

  printConsoleLog(arg) {
    console.log(arg);
  }
}
