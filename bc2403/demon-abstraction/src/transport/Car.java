package transport;

public class Car extends Transport{
  
  private String name;

  public Car(double maxSpeed, double accelration, String name) {
  super(maxSpeed, accelration);
  this.name =name;
  }
}
