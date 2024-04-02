public class demonString {
  public static void main(String[] avgs) {

    String s ="hello";
    String s2 = "";
    String s3 = " ";
    String s4 = "    ";

    // isEmpty (true if empty)
    boolean isEmptyResult = s2.isEmpty(); // true
    System.out.println(isEmptyResult);

    System.out.println(s.isEmpty());
    System.out.println(s3.isEmpty());

    // isBlank (true if blank or empty)
    System.out.println(s3.isBlank()); 
    System.out.println(s4.isBlank());

    // substring()
    String result = s.substring(0, 3); //hel
    System.out.println(result);

    result = s.substring(2); // llo, if no end index, will substring until the end.
    System.out.println(result);

    //toLowerCase()
    System.out.println("HElLO".toLowerCase()); //hello
    // toUpperCase()
    System.out.println("HELlo".toUpperCase()); //HELLO
    
    // contains
    System.out.println(s.contains("ll")); //true

    // startsWith()
    s.startsWith("he"); //true
    System.out.println(s.startsWith("he"));

    //endsWith()
    s.endsWith("lo"); //true
    System.out.println(s.endsWith("lo"));

    // replace()
    String after = s.replace("l", "z");
    System.out.println(after);

    // trim()-> remove the space at the beginning and the tail of the string
    String s5 = "   hello  ! world   ";
    System.out.println(s5.trim()); // remove頭尾space
    System.out.println(s5.replace(" ","")); // remove all spaces
    // trim() faster than replace()

    // indexOf()
    char c = s.charAt(2); // 'l'
    System.out.println(s.indexOf('l')); // 2 -> the index of the first matching character
    System.out.println(s.indexOf('!')); //-1



  }
}
