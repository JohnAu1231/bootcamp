/*
 * 
 * Question : Given a positive integer num consisting only of digits 3 and 5. Return the minimum number you can get by changing at most two digit (3 becomes 5, or 5 becomes 3).
 * 
 * Example 1 : Input : num = 3535 Output : 3333
 * 
 * Example 2 : Input: num = 5555 Output: 3355
 */
public class JavaQuest17 {

  public static void main(String[] args) {
    System.out.println(minimum35Number(3355)); // Output : 3333
    System.out.println(minimum35Number(5353));// Output : 3333
    System.out.println(minimum35Number(3535));// Output : 3333
    System.out.println(minimum35Number(5555));// Output : 3355
    System.out.println(minimum35Number(3333));// Output : 3333
    System.out.println(minimum35Number(3353));// Output : 3333
    System.out.println(minimum35Number(5535));// Output : 3335

  }

  // finish the code
  // Hints : int -> String -> array
  public static int minimum35Number(int num) {
    // code here ...
    int changeTime = 2;
    String str = String.valueOf(num);
    char[] numChar = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      numChar[i] = str.charAt(i);
      if (numChar[i] == '5' && changeTime > 0) {
        numChar[i] = '3';
        changeTime--;
      }
    }
    String str2 = "";
    for (int i = 0; i < str.length(); i++) {
      // str2.concat(String.valueOf(numChar[i]));
      str2 += numChar[i];
    }
    int ans = Integer.valueOf(str2);

    return ans;
  }
}
