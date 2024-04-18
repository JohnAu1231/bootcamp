package transport;

import java.math.BigDecimal;

public interface Weapon {

  double fireRate();

  public static double avgFireRate(Weapon[] weapons) {
    BigDecimal ans = BigDecimal.valueOf(0);
    for (Weapon w : weapons) {
      ans = ans.add(BigDecimal.valueOf(w.fireRate()));
    }
    return (ans.divide(BigDecimal.valueOf(weapons.length)).doubleValue());
  }
  
  public static void main(String[] args) {
    
    Weapon[] china = new Weapon[4];
    china[0] = new Tank(30, 4, 2, 2);
    china[1] = new Tank(30, 4, 40, 6);
    china[2] = new Helicopter(10,300);
    china[3] = new Tank(30, 4, 10, 4);

    System.out.println(avgFireRate(china));
  }
}
