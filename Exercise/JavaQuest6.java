public class JavaQuest6 {
  /**
   * Expected output: 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    int[] fiboncci = new int[15];
    fiboncci[0] = 1;
    fiboncci[1] = 1;
    for (int i = 0; i < 15; i++) {
      if (i < 2) {
        System.out.println(fiboncci[i]);
      } else {
        fiboncci[i] = fiboncci[i - 2] + fiboncci[i - 1];
        System.out.println(fiboncci[i]);
      }


    }
  }
}
