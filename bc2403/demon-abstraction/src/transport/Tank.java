package transport;

import java.math.BigDecimal;

public class Tank extends Transport implements Weapon{

  private double reloadTime;

  private int ammo;

  public Tank(double maxSpeed, double accelration, double reloadTime, int ammo) {
    super(maxSpeed, accelration);
    this.reloadTime = reloadTime;
    this.ammo = ammo;
  }
  
  @Override
  public double fireRate() {
    return BigDecimal.valueOf(60).divide(BigDecimal.valueOf(this.reloadTime)).multiply(BigDecimal.valueOf(this.ammo)).doubleValue();
  }

  public static void main(String[] args) {
    
    Tank tank = new Tank(40.0d, 4.0d, 30.0d, 4);
    System.out.println(tank.fireRate());
    
  }
}
