package com.bootcamp.demo2403;

import java.util.List;

public class StringChecker {
  public static boolean isPalindrome(String s) {
    return new StringBuilder(s).reverse().toString().equals(s);
  }


  public static String concat(List<String>strings) {
  StringBuilder sb = new StringBuilder();
  for (String s : strings){
    sb.append(s);
  }
  return sb.toString();
  }

}
