package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class StringCheckerTest {
  


  @Test 
  void testIsPalindrome() {
      assertTrue(StringChecker.isPalindrome("racar"));
  }

  @Test
  void testConcat() {
      List<String> ls = new ArrayList<>();
      ls.add("ABC");
      ls.add("DEF");
      ls.add("GHI");
      assertEquals(new String("ABCDEFGHI"), StringChecker.concat(ls));
  }

  @Test
  void testSameString() {
    String s1 = "hello";
    String s2 = new String("hello");
    assertFalse(s1 == s2);
    assertNotSame(s1, s2); // assertNotSame -> Not same object

    String s3 = "hello"; // Literal Pool
    assertSame(s1, s3);
    assertEquals(s2, s3);
  }
}
