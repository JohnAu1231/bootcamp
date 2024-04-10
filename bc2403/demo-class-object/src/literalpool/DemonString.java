package literalpool;

public class DemonString {
  
  public static void main(String[] args) {
    String s = "hello";
    String s2 = "hello";

    System.out.println(System.identityHashCode(s)); //617901222, hashcode -> object address
    System.out.println(System.identityHashCode(s2)); //617901222

    String s3 = "hello ";
    System.out.println(System.identityHashCode(s3)); //1159190947

    String s4 = new String("hello");
    System.out.println(System.identityHashCode(s4)); //925858445

    String s5 = String.valueOf("hello");
    System.out.println(System.identityHashCode(s5)); //617901222

    System.out.println(s == s2); // same object reference
    System.out.println(s == s3); // different object referenece
    System.out.println(s == s4);// new object reference
    System.out.println(s == s5); // same object reference

    StringBuilder sb1 = new StringBuilder("hello");
    StringBuilder sb2 = new StringBuilder("hello");
    System.out.println(sb1 == sb2);// false

    // java String is immuntable

    String str = "aaa";
    System.out.println(System.identityHashCode(str)); //798154996
    str = str + "bbb";
    System.out.println(System.identityHashCode(str)); //1450495309
  }
}
