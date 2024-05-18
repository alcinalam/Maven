package com.bootcamp.demo2403;

public class Cat {
  public int sum (int x , int y) {
    return x + y;
  }

  public int subtract(int x , int y) {
    return x - y;
  }
  

  public static void main(String[] args) {
    System.out.println(new Cat().sum(8,10)); //18
  }
}
