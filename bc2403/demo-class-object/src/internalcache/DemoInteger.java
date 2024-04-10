package internalcache;

public class DemoInteger {
  
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(127);
    Integer i2 = Integer.valueOf(127);
    System.out.println(i1 == i2); ///true
    System.out.println(System.identityHashCode(i1)); //617901222
    System.out.println(System.identityHashCode(i2)); //617901222

    Integer i3 = Integer.valueOf(128);
    Integer i4 = Integer.valueOf(128);
    System.out.println(i3 == i4); //false
    System.out.println(System.identityHashCode(i3)); //1159190947
    System.out.println(System.identityHashCode(i4)); //925858445

    // Support Internal Cache
    // Integer, Byte, Long, Short
    // Character support in 256
    // Not support Internal Cache
    // Float, Double

    Float f1 = Float.valueOf(127.0F);
    Float f2 = Float.valueOf(128.0F);
    System.out.println(f1 == f2);
    System.out.println(System.identityHashCode(f1));
    System.out.println(System.identityHashCode(f2));

    Double d1 = Double.valueOf(127.0d);
    Double d2 = Double.valueOf(128.0d);
    System.out.println(d1 == d2);
    System.out.println(System.identityHashCode(d1));
    System.out.println(System.identityHashCode(d2));

    Character c1 = Character.valueOf('z');
    Character c2 = Character.valueOf('z');
    System.out.println(c1 == c2); // true;

    Character c3 = Character.valueOf('$');
    Character c4 = Character.valueOf('$');
    System.out.println(c3 == c4); // true

    Character c5 = Character.valueOf('木');
    Character c6 = Character.valueOf('木');
    System.out.println(c5 == c6);  // false

  }
}
