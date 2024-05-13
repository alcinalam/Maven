package com.example.parent;

import lombok.Value;
import lombok.With;

// read-only

@Value //@AllargConstructor + Getter
public class Person {
  private String name;
  private int age; 

  public static void main(String[] args) {
    Person p1 = new Person("Sally", 5);
    System.out.println(p1.getAge());
    System.out.println(p1.getName());

    Person p2 = new Person("Sally", 5);
    System.out.println(p1.equals(p2)); // true
    System.out.println(p1);
    System.out.println(p2);

    
  }


}
