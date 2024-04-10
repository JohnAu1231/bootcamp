package bc2403.stringbuilder;

public class DemoSB {
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "def";

    String result = s1 + s2;
    String result2 = s1.concat(s2); // concat() -> return new String

    StringBuilder sb1 = new StringBuilder(); // ""
    
    System.out.println(sb1.toString());

    StringBuilder sb2 = new StringBuilder("hello");
    System.out.println(sb2.toString()); // "hello"

    StringBuilder sb3 = sb2.append("world"); // sb2 also change itself
    System.out.println(sb2);

    sb2.append("!!!");
    System.out.println(sb2.toString());

    String[] strings = new String[] {"aaa", "bbb", "ccc"};
    StringBuilder a = new StringBuilder();
    for (String i : strings) {
      a.append(i);
    }
    System.out.println(a.toString()); // aaabbbccc

    // insert()
    a.insert(6, "ddd");
    System.out.println(a.toString()); // aaabbbcccddd

    //reverse()
    a.reverse();
    System.out.println(a);

    //deleteCharAt()
    a.deleteCharAt(3);
    System.out.println(a);

    //setCharAt();
    a.setCharAt(2, 'p');
    System.out.println(a);

    String result10 = a.toString().replace("b", "y");
    System.out.println(result10);
    System.out.println(a);

    StringBuilder sb5 = new StringBuilder("mmm");
    StringBuilder sb6 = new StringBuilder("mmm");
    if (sb5.compareTo(sb6) == 0) {
      System.out.println("they are equal");
    }

    String s = "mmm";
    if (sb5.toString().equals(s)) {
      System.out.println("they are equal");
    }

    sb5.setLength(100);
    System.out.println(sb5.toString());
    sb5.append("zzz");
    System.out.println(sb5.toString());
  }
}
