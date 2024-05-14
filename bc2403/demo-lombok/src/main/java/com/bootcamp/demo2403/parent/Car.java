package com.bootcamp.demo2403.parent;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true) // default callSuper = false
@EqualsAndHashCode(callSuper = true)    // default callSuper = false
public class Car extends BigCar{
  private String model;

  //Custom Constructor
  public Car(String model, double weight) {
    super(weight);
    this.model = model;
  }
  public static void main(String[] args) {
    Car car = new Car("TSLA");  //AllArgsConstructor
    car.setWeight(11.2);
    car.getWeight();
    System.out.println(car.toString());
    Car car2 = new Car("TSLA");
    car2.setWeight(11.2);
    System.out.println(car.equals(car2));
  }
}
