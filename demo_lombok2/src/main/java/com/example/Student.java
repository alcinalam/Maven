package com.example;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

// put on(above) class, apply to all
// Getter/Setter is a field/class level annotation

@AllArgsConstructor
public class Student {
  @Getter
  @NonNull // compile with throw null pointer
  private String name;
  @Setter
  private int age;

  public static void main(String[] args) {
    Student s1 = new Student("Sally",4);
    System.out.println(s1.getName());

    s1.setAge(3);

    
    
  }
}
