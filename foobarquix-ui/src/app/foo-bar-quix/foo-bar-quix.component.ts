import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {

  constructor(private fooBarQuixService: FooBarQuixService) { }

  numberConverted: NumberConverted = {
    result: "",
    numberToConvert: 0
  };

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.fooBarQuixService.convertNumber(inputNumber).subscribe(
      data => {
        this.numberConverted.result = data['result'];
        this.numberConverted.numberToConvert = inputNumber;
      },err=> {
        console.log(err);
      }
    )
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}