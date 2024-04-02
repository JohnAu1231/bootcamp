public class DemoForLoop2 {
  public static void main(String[] args) {// hotkey main + enter
    // hotkey sysout + enter


    // Single Loop
    for (int i = 0; i < 5; i++) { // 0,1,2,3,4
      System.out.print("*"); // *****
    }
    // Nested Loop
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println("i=" + i + ",j=" + j);

      }
      System.out.println("Hello");
    }
    /*
     * i=0,j=0 i=0,j=1 i=1,j=0 i=1,j=1 i=2,j=0 i=2,j=1
     */

    // i = 0
    // i < 3 yes // i = 0
    // j = 0 // start nested loop
    // i + 1 // i = 1
    // j < 2 yes
    // j + 1 // j = 1
    // j < 2 yes
    // j + 1 // j =2
    // j < 2 no // break // end nested loop
    // i < 3 yes // i = 1
    // ...j nested loop ...
    // i + 1 // i = 2

    // i < 3 yes // i = 2
    // ...j nested loop ...
    // i + 1 // i = 3
    // i < 3 no // i =3
    // break

    // ***** i = 0 j = 5
    // **** i = 1 j =4
    // ***
    // **
    // *
    int n = 5;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    for (int i = n; i > 0; i--) { // 5 4 3 2 1
      for (int j = i; j > 0; j--) { // i=5 j=5,4,3,2,1;i=4 j=4,3,2,1;i=3,j=3,2,1;i=2,j=2,1;i=1,j=1;
        System.out.print("*");
      }
      System.out.println("");
    }

    // ******** *=7
    // ********** *=9
    // ******** *=7
    // " "," ","*"," "," " i = 0, j = 0 " ", j = 1 " ", j = 2, "*", j = 3, " " j = 4 " "
    // " ","*","*","*"," " i = 1
    // "*","*","*","*","*" i = 2
    // " ","*","*","*"," " i = 3
    // " "," ","*"," "," " i = 4

    n = 5;
    // (n%2 =1
    // (n - i - 1)/2 2
    // (n - i - 1)/2 1

    int spaceCount = 0;
    // *: 1,3,5,3,1 " ":2,1,0,1,2

    //靠右三角
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        System.out.print(" ");
      }
      for (int j = n - i; j <= n; j++ ){
        System.out.print("*");
      }
      System.out.println("");
    }
    //靠右倒三角
    for (int i = 0; i < n - 1; i++) {
      for (int j = n - i; j <= n; j++ ) {
        System.out.print(" ");
      }
      for (int j = i + 1; j < n; j++){
        System.out.print("*");
      }
      System.out.println("");
    }
    //     System.out.print("*");
    //   }
    //   System.out.println("");
    // }



    // Searching
    String str2 = "abcdefg hello world";
    // Find the inde of the second of space character, if exists, print the index, if no print N/A
    String searchPattern = " ";
    int times = 2;
    int countT = 0;

    for (int i = 0; i < str2.length(); i++) {
      if (str2.charAt(i) == ' ') { // if (str2.charAt(i) == ' ' && ++countT == 2) {
        // countT++;
        if (++countT == 2) {
          System.out.println("index=" + i);
          break;
        }
      }
    }
    if (countT < 2) {
      {
        System.out.println("N/A");
      }



    }

    // break; break = break the nearest loop
    for (int i = 0; i < 10; i++) {
      System.out.println("aaa");// 4 times because loop is breaked when i > 3
      if (i > 3) { // 0,1,2,3
        break;
      }
      System.out.println("Hello" + i); // 4 times
    }
    // continue; skip the rest, go to next iteration
    for (int i = 0; i < 10; i++) {
      System.out.println("abc"); // 10 times
      if (i > 3) { // 0,1,2,3
        continue; // if i > 3, skip the following codes
      }
      System.out.println("Hello" + i); // 4 times, because when i>3 , this code will be skipped
    }
  }
}

