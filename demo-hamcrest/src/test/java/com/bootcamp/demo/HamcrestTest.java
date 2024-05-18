package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class HamcrestTest {
  
  @Test
  void testString(){
    String actualValue = "Hello";
    String expectedValue = "Hello";
    String expectedValue2 = "Hello2";

    // Junit 5
    assertEquals(actualValue,expectedValue);

    // Hamcrest
    assertThat(actualValue, is(equalTo(expectedValue)));
    assertThat(actualValue, is(not(equalTo(expectedValue2))));

    String s1 = null;
    String s2 = "abc";
    assertThat(s1,is(nullValue()));
    assertThat(s2,is(not(nullValue())));

    // Same instance
    String s3 = "abc";
    String s4 = "abc";
    String s5 = new String ("abc");
    assertThat(s3,is(sameInstance(s4)));
    assertThat(s3,is(not(sameInstance(s5))));

    int value = 42;
    assertThat(value, allOf(//
      greaterThan(41), //
      greaterThanOrEqualTo(42), //
      equalTo(42), //
      lessThan(43), //
      lessThanOrEqualTo(42) //
    ));
      
    //   assertThat(value, allOf(//
    //     is(greaterThan(43)), // false
    //     is(greaterThanOrEqualTo(42)), // true
    //     is(equalTo(43)), // false
    //     is(lessThan(41)), // false
    //     is(lessThanOrEqualTo(41)) // false
    // ));

    assertThat("hello", startsWith("h"));
    assertThat("hello", not(startsWith("l")));
    assertThat("hello", endsWith("o"));
    assertThat("hello", not(endsWith("l")));

    assertThat ("hello", containsString("ll"));
    assertThat ("hello", not(containsString("lll")));

    assertThat ("hello", is(not(emptyString())));
    assertThat ("", is(emptyString()));

   }

   @Test
   void testList() {
     // you cannot add/remove elements in the below list.
     // this is not an arrylist object
     List<String> wrongway = List.of("apple","orange"); 
    
    // Correct way
    List<String> str = new ArrayList<>(List.of ("apple","orange"));
    List<String> str2 = Arrays.asList("apple","orange");

    assertThat (str, hasSize(2));
    assertThat (str, contains("apple","orange"));
    assertThat (str, not(contains("orange","apple"))); // not, coz not in order
    assertThat (str, not(contains("kiwi")));

    assertThat (str, containsInAnyOrder("orange","apple"));
    assertThat (str, containsInAnyOrder("apple","orange"));

    List<String> emptyList = new ArrayList<>();
    List<String> emptyList2 = Collections.emptyList();
    assertThat(emptyList, is(empty()));
    assertThat(str, is(not(empty())));

    assertThat (str, hasItem("orange"));
    assertThat (str, hasItems("apple","orange"));
    
   }

   @Test
   void testTolerance () {
    double tolerance = 0.1d;
    double actual = 3.14d; // 3.04 < x < 3.24
    assertThat (actual, closeTo (3.06,tolerance));
    assertThat (actual, not(closeTo(3.00,tolerance)));
    assertThat (actual, not(closeTo(3.25, tolerance)));
   }

   
   @Test
   void testInstanceOf() {
     Number number = Long.valueOf(13);
     assertThat (number, is (instanceOf(Long.class)));
     assertThat (number, is(instanceOf(Number.class)));

     assertThat (Double.class, typeCompatibleWith(Number.class));
   }


  }
