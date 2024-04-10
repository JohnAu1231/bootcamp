/*
 * Question : Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 * 
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 * 
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * 
 * the input need to be lowercase English letters.
 */

import java.util.Arrays;

public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {
    // code here ...

    for (int j = 0; j < goal.length(); j++) {
      char[] target = new char[goal.length()];
      char temp = goal.charAt(0);
      for (int i = 0; i < goal.length() - 1; i++) {
        target[i] = goal.charAt(i + 1);
      }
      target[goal.length() - 1] = temp;
      String ans = "";
      for (int i = 0; i < goal.length(); i++) {
        ans = ans.concat(String.valueOf(target[i]));
      }
      goal = ans;
      if (s.equals(goal)) {
        return true;
      }
    }
    return false;
  }
}
