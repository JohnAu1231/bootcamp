public class DemoForLoop {
  public static void main(String[] args) {
    int x = 2;
    x = x * x; // 2*2=4
    x *= x; // 4*4 = 16
    System.out.println(x);

    // 2^60]


    // for (initialization; continue conditionl incremental rule)
    // Never to re-assign value to i within the loop
    for (int i = 0; i < 3; i++) { // 0,1,2
      System.out.println("hello world");
      // Step 1 : int i = 0
      // Step 2 : i <3 ? yes
      // Step 3 : Print hello world
      // Step 4 : i++ -> i become 1
      // Step 5 : i <3 ? yes
      // Step 6 : Print hello world
      // Step 7 : i++ -> i become 2
      // Step 8 : i <3? yes
      // Step 9 : Print hello world
      // Step 10" i++ -> i become 3
      // Step 11: i <3? no
      // Break

    }
    for (int i = 5; i >= 0; i--) { // 5,4,3,2,1,0
      System.out.println(i);
    }

    // print out: 1,3,5,7,9

    for (int i = 1; i <= 9; i += 2) {
      System.out.print(i + " ");
    }
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1) { // odd number
        System.out.print(i + " ");
      }
    }
    String s = "abcdefghijklmn";
    // print out: aceg
    for (int i = 0; i < s.length(); i++) { // 0,1,2,3,4,5,6
      if (i % 2 == 0) { // even number
        System.out.print(s.charAt(i));
      }


    }
    // 用IF sort index, don't sort index in for loop condition ()
    String result = "";
    for (int i = 0; i < s.length(); i++) { // 0,1,2,3,4,5,6
      if (i % 2 == 0) { // even number
        result += s.charAt(i); // 0,2,4,6
      }
    }
    System.out.println(result);

    /*
     * String pattern = "cd"; print true
     */
    String z = "qwercdabcdef";
    String pattern = "abcd";
    for (int i = 0; i < (z.length() - pattern.length()); i++){


        result = "";
        for (int g = i; g < (i + (pattern.length())); g++){
          result += z.charAt(g);
        }
        if (pattern.equals(result)) {
          System.out.println(true);
        }
    }
      //4
      //5
      //s.lenth() long
    
    // 55 = 1+ 2 +3 +4 ... + 10
    int max = 10;
    int min = 1;
    int k = 0;
    for (int i = min; i <= max; i++) {

      k += i;

    }
    System.out.println(k);

    // sum all even numbers
    int k2 = 0;
    for (int i = min; i <= max; i++) { // 2,4,6,8,10
      if (i % 2 == 0) {
        k2 += i;
      }
    }
    System.out.println(k2);

    // Counting
    String str = "hello world";
    // count the number of 'l' ->3
    int countL = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'l'){ // char == char 
        countL++;
      }
      // if ("l".equals(str.charAt(i))){
      // String l = "";
      // l += str.charAt(i); 
      // if ("l".equals(l)) {
      //   countL += 1;
      // }
    }
    System.out.println(countL);

    // sum sup all odd numbers, and subtract all even numbers
    // 1 -2 +3 -4 +5 ... -10
    int oddSubtractEven = 0;
    for (int i = min; i <= max; i++) {
      if (i % 2 == 1) {
        oddSubtractEven += i;
      } else if (i % 2 == 0) {
        oddSubtractEven -= i;
      }
    }
    System.out.println(oddSubtractEven);

    String s1 = "abcd";

    for (int i = 1; i <= s1.length(); i++) {
      
    }

  }
}
