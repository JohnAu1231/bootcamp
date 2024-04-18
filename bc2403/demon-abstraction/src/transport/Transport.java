package transport;

import java.math.BigDecimal;

public abstract class Transport {

  private double maxSpeed;

  private double accelration;

  public Transport(double maxSpeed, double accelration) {
    this.maxSpeed = maxSpeed;
    this.accelration = accelration;
  }

  public double toMaxSpeedTime() {
    return BigDecimal.valueOf(this.maxSpeed).divide(BigDecimal.valueOf(accelration)).doubleValue();
  }

  
}
