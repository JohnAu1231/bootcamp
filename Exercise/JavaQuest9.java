/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    // code here ...
    for (int i = 0; i < str.length(); i++) { 
      if (str.charAt(i) == 'J') {
        System.out.println(str.charAt(i));
        break;
      }
    }
    for (int i = 0; i < str.length(); i++) { 
      if (str.charAt(i) == 'e') {
        System.out.println(str.charAt(i));
        break;
      }
    }    
    System.out.println(str.charAt(str.indexOf('J')));
    System.out.println(str.charAt(str.indexOf('e')));
    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...
    System.out.println(str.indexOf("t"));
    System.out.println(str.indexOf("x"));
    System.out.println(str.indexOf("L"));

    // Use String trim()
    String abc = "    ab c    ";
    System.out.println(abc.trim());
    // prints "ab c"

    // Use String replace() method
    // String str = "VenturenixLAB, Java";
    // prints VenturenixLAB, Coding
    // code here ...
    String str2 = str;
    System.out.println(str2.replace("Java", "Coding"));
    // int length()

    // prints 19
    // code here ...
    System.out.println(str2.length());
    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    int indexS = str.indexOf("r");
    int indexE = str.indexOf("i");
    System.out.println(str.substring(indexS, indexE));
    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    String str3 = str.toUpperCase();
    System.out.println(str3.toUpperCase());
    System.out.println(str3.toLowerCase());

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.println((str.replace("e", "*")).toUpperCase()+"!!!");

  }
}