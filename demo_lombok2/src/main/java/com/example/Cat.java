package com.example;

public class Cat {

  private String name;
  private int age;

  public Cat(String name, int age) {
    if (name == null) {
      throw new NullPointerException("Name cannot be empty.");
    }
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    Cat c = new Cat("Vincent", 10);
    System.out.println(c);
  }
}
