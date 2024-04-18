package transport;

import java.math.BigDecimal;

public class Helicopter implements Weapon {
  
  private double reloadTime;

  private int ammo;

  public Helicopter(double reloadTime, int ammo) {
    this.reloadTime = reloadTime;
    this.ammo = ammo;
  }
  
  @Override
  public double fireRate() {
    return BigDecimal.valueOf(60) //
          .divide(BigDecimal.valueOf(4)) //
          .divide(BigDecimal.valueOf(this.reloadTime)) //
          .multiply(BigDecimal.valueOf(this.ammo)) //
          .doubleValue();
  }
}
