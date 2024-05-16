package com.bootcamp.bc2403;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cat {
  
  // private int x;
  // private int y;

  public int sum(int x, int y) {
    // return this.x + this.y;
    return x + y;
  }

  public static void main(String[] args) {
    // Cat cat = new Cat(1,3);
    // System.out.println(cat.sum()); //4
    System.out.println(new Cat().sum(8,10));
  }
}
