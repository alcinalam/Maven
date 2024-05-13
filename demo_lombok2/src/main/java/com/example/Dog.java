package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Annotations
@AllArgsConstructor
@Getter
@Setter

public class Dog {

  private String name;
  private int age;

  // Custom constructor
  public Dog(String name) {
    this.name = name;
  }

  // Custom constructor
  public Dog() {
    this.name = "Mandy";
    this.age = 4;
  }

  public static void main(String[] args) {
    Dog dog = new Dog("Sally", 3);
    Dog dog2 = new Dog();
    dog.setAge(10);

    System.out.println(dog.getAge());

  }
}
