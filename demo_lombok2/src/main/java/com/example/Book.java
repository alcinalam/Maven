package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data 
//@RequiredArgsConstructor, @ToString, @EqualsANDHashCode,@Getter, @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
  private String name;
  @NonNull
  private Color color;


  public static void main(String[] args) {
    Book b1 = new Book("Sally", Color.RED);
    b1.setColor(Color.YELLOW);
    b1.setName("ABC");
    System.out.println(b1.toString());
    Book b2 = new Book("cherry", Color.YELLOW);
    System.out.println(b1.getColor());
    System.out.println(b1.equals(b2)); //true
    Book b3 = new Book(); // NoargsConstructor
  }
}
