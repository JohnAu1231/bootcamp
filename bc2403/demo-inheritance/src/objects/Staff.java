package objects;

import java.time.LocalDate;

public class Staff { // 1. All class implicity extends Topmost class "Object"

  private LocalDate joinDate;

  public Staff(LocalDate joinDate) {
    this.joinDate = joinDate;
  }

  public LocalDate getJoinDate() {
    return this.joinDate;
  }
  // 2. Every Class should implement/override its own toString() to represent its object values
  @Override
  public String toString() {
    return "Staff("  //  
    +  "joinDate=" + this.joinDate //
    + ")";
  }

  public static void main(String[] args) {
    Object o = new Object();
    System.out.println(o.toString()); //java.lang.Object@24d46ca6

    Staff s = new Staff(LocalDate.now());
    System.out.println(s.toString()); //objects.Staff@2a84aee7, object reference 2a84aee7= objectId
    //After adding toString() method, can print Staff(joinDate=2024-04-17).
    Staff s2 = new Staff(LocalDate.now());
    System.out.println(s2.toString()); 

    System.out.println(s.getJoinDate().compareTo(s2.getJoinDate()));
  }
}
