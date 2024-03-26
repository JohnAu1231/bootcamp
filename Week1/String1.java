//String is a key word in Java. It should not use to be a variable
// Java: compile language: java file (Helloworld.java)->Compilation->class file(byte code - Helloworld.class)
// javac 將JAVA compile,javac is the primary JAVA compiler, 再class file 俾java run
public class String1 {
  public static void main(String[] args) {
    int x = 0;

    String y = "Hello World!";
    String s = "1";
    // int sum = x + s;
    String s3 = "";// empty string
    String s4 = " "; // space

    // Tool for String
    // length()
    int lengthOfY = y.length(); //12

    // charAt()
    //In java, index has not negative value
    char character = y.charAt(0); //h
    char character2 = y.charAt(1); //e
    char character3 = y.charAt(2); //l
    System.out.println(character);
    System.out.println(character2);
    System.out.println(character3);
    // System.out.println(y.charAt(100)); // Runtime Error, Not compile error, String index out of range: 100
    // System.out.println(y.charAt(-10)); //String index out of range: -10

    //equals()
    String s1 = "hello";
    String s2 = "hello";

    boolean isS1EqualsToS2 = s1.equals(s2); // true
    System.out.println(isS1EqualsToS2);

    //concat
    String s6 = s1 + s2; //hellohello
    System.out.println(s6);//hellohello
    // -,*,/ are not allowed for String in Java
    String s7 = s6 + 10; //String + int -> String(s6)+String(10) = hellohello10
    System.out.println(s7);
    System.out.println(s7 + 'a');
    System.out.println(s7 + 10.3);
    System.out.println("hello" + true);
    // String x = 10 + 10; // int + int -> int
    // String y = ture + true; // boolean can not add

    String s8 = "world";
    s8 += "!";
    System.out.println(s8);
    s8 += "!";
    s8 += "!";
    s8 += "!";
    System.out.println(s8);
    //String can't ++, not value

  }
}