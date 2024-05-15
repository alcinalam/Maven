package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

public class StringCheckerTest {

    @Test
    void testConcat(){
      assertEquals("abcdefijk",StringChecker.concat(List.of("abc","def","ijk")));
    }


  @Test
  void testIsPalindrome() {
    assertTrue(StringChecker.isPalindrome("racar"));
    assertFalse(StringChecker.isPalindrome("dfase"));
  }

  @Test
  void testSameString() {
    String s1 = "hello";
    String s2 = new String("hello");
    assertFalse(s1 == s2);
    assertNotSame(s1,s2); // assertNotSame -> Not same object

    String s3 = "hello"; // Literal Pool
    assertSame(s1,s3);
    assertEquals(s2, s3);
  }


}
