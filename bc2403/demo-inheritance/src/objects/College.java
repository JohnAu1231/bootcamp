package objects;

import java.util.Objects;

public class College {

  private double area;

  public double getArea() {
    return this.area;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof College))
      return false;
    College col = (College) obj;
    return Objects.equals(this.area, col.getArea());
  }

  @Override 
  public int hashCode() {
    return Objects.hash(this.area);
  }

  @Override
  public String toString() {
    return "College(" //
          + "area=" + this.area //
          + ")";
  }

  public static void main(String[] args) {
    Object o = new College();  // Polymorphism
    // College c = new Object(); // not ok
    // College c = new College(); //ok
    System.out.println(o.hashCode());// address ->. int
    System.out.println(o.toString());
    // System.out.println(o.equals(o));
    if (o instanceof College) {  // ask if o is an object of college.calss, instanceof -> true/false;
      College c2 = (College) o;
    }

    Class<?> s = o.getClass();
    System.out.println(s.getName());  // return object.College   (object.class)
    String str = new String ("ABC");
    System.out.println(str.hashCode());
    System.out.println(o.toString());
    

  }
}

