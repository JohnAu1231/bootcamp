public class LoopTest {
  public static void main(String[] args) {
    int n = 5;

    // ******** *=7
    // ********** *=9
    // ******** *=7
    // " "," ","*"," "," " i = 0, j = 0 " ", j = 1 " ", j = 2, "*", j = 3, " " j = 4 " "
    // " ","*","*","*"," " i = 1
    // "*","*","*","*","*" i = 2
    // " ","*","*","*"," " i = 3
    // " "," ","*"," "," " i = 4

    n = 5;
    // n
    // (n%2 =1
    // (n - i - 1)/2 2
    // (n - i - 1)/2 1

    int spaceCount = 0;
    // *: 1,3,5,3,1 " ":2,1,0,1,2

    // method 1
    // Diamond
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n - 1; j++) {
        System.out.print("O");
      }
      for (int j = n - i; j < n + 1; j++) {
        System.out.print("*");
      }
      for (int j = n - i + 1; j < n + 1; j++) {
        System.out.print("*");
      }
      for (int j = i + n; j < 2 * n - 1; j++) {
        System.out.print("O");
      }

      System.out.println("");
    }
    // diamond
    // 7* to 1*
    for (int i = 0; i < n - 1; i++) {
      for (int j = n - i; j < n + 1; j++) {
        System.out.print("O");
      }
      for (int j = i; j < n - 1; j++) {
        System.out.print("*");
      }
      for (int j = i + n; j < 2 * (n - 1); j++) {
        System.out.print("*");
      }
      for (int j = n - i; j < n + 1; j++) {
        System.out.print("O");
      }
      System.out.println("");
    }


    // method 2
    for (int i = 0; i < 2 * n - 1; i++) {
      if (i < n) {
        for (int j = i; j < n - 1; j++) {
          System.out.print("O");
        }
        for (int j = n - i; j < n + 1; j++) {
          System.out.print("*");
        }
        for (int j = n - i + 1; j < n + 1; j++) {
          System.out.print("*");
        }
        for (int j = i + n; j < 2 * n - 1; j++) {
          System.out.print("O");
        }

        System.out.println("");
      } else { // 5,6,7,8

        for (int j = 2 * n - i; j < n + 1; j++) {
          System.out.print("O");
        }
        for (int j = i; j < 2 * n - 1; j++) {
          System.out.print("*");
        }
        for (int j = i; j < 2 * (n - 1); j++) {
          System.out.print("*");
        }
        for (int j = 2 * n - i; j < n + 1; j++) {
          System.out.print("O");
        }
        System.out.println("");
      }
    }

    // n = 10;
    // // for fun
    // for (int k = 0; k < 10; k++) {
    //   for (int i = 0; i < n; i++) {
    //     for (int j = i; j < n - 1; j++) {
    //       System.out.print("-");
    //     }
    //     System.out.print("*");
    //     for (int j = n - i; j < n; j++) {
    //       System.out.print("-");
    //     }
    //     System.out.println("");
    //   }
    //   for (int i = 0; i < n - 2; i++) {
    //     for (int j = n - i - 1; j < n; j++) {
    //       System.out.print("-");
    //     }
    //     System.out.print("*");
    //     for (int j = i; j < n - 2; j++) {
    //       System.out.print("-");
    //     }
    //     System.out.println("");
    //   }
    // }



  }

}
