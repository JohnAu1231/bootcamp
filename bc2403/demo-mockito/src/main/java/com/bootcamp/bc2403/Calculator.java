package com.bootcamp.bc2403;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Calculator {
  
  private int x;
  private Cat cat;
  
  public int sum() {
    return this.cat.sum(this.x, 10) +3;
  }


  public static void main(String[] args) {
    Calculator calaculator = new Calculator(8, new Cat());
    System.out.println(calaculator.sum());
  }
}
