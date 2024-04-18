package objects;

import java.util.Arrays;
import java.util.Objects;

public class MacbookAir {

  private double inch;

  private double cpu;

  private double ram;

  private double disk;

  private Color color;

  public MacbookAir(double inch, double cpu, double ram, double disk, Color color) {
    this.inch = inch;
    this.cpu = cpu;
    this.ram = ram;
    this.disk = disk;
    this.color = color;
  }

  public double getInch() {
    return this.inch;
  }

  public double getCpu() {
    return this.cpu;
  }

  public double getRam() {
    return this.ram;
  }

  public double getDisk() {
    return this.disk;
  }

  public Color getColor() {
    return this.color;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj) 
      return true;
    if (!(obj instanceof MacbookAir))
      return false;
    MacbookAir mac = (MacbookAir) obj;
    // return this.inch == mac.getInch() //
    //     && this.cpu == mac.getCpu() //
    //     && this.ram == mac.getRam() //
    //     && this.disk == mac.getDisk() //
    //    && this.color == mac.getColor(); //
    return Objects.equals(this.inch, mac.getInch())
    && Objects.equals(this.cpu, mac.getCpu())
    && Objects.equals(this.ram, mac.getRam())
    && Objects.equals(this.disk, mac.getDisk())
    && Objects.equals(this.color, mac.getColor());
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(this.inch, this.cpu, this.ram, this.disk, this.color);
    }


    public static void main(String[] args) {
      
      MacbookAir mac1 = new MacbookAir(2.0, 2.0, 16, 128, Color.Black);
      MacbookAir mac2 = new MacbookAir(mac1.getInch(), mac1.getCpu(), mac1.getRam(), mac1.getDisk(), mac1.getColor());
      MacbookAir mac3 = new MacbookAir(2.0, 2.0, 8, 128, Color.Black);
      MacbookAir mac4 = mac1;
      System.out.println(mac1.equals(mac2)); // ture // using equals method
      System.out.println(mac1 == mac2); //false  // comparing object reference 
      System.out.println(mac1.equals(mac3)); // false
      System.out.println(mac1.equals(mac4)); // true

      //hashCode checking object reference
      System.out.println(mac1.hashCode()); //1159190947, Object.class hashCode() //after build method 110932546
      System.out.println(mac2.hashCode()); //925858445  //after build method 110932546
      System.out.println(mac3.hashCode()); //798154996  //after build method -896748990
      System.out.println(mac4.hashCode()); //1159190947  //after build method 110932546
      
      System.out.println(System.identityHashCode(mac1)); //1159190947
      
      // Sorting
      int[] arr = new int[] {10, 5, 2, 4};
      Arrays.sort(arr); // mergesort, ascending sorting
      System.out.println(Arrays.toString(arr));
    }
  
}
