package com.example;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
@EqualsAndHashCode
public class Square implements Shape {

  private double length;

  @Override
  public double area() {
    return Math.round(BigDecimal.valueOf(this.length)//
    .multiply(BigDecimal.valueOf(this.length))//
    .doubleValue());
  }

  @Override
  public void print() {
    System.out.println("This is a square, the input is "//
     + getLength() + " and the area is " + this.area());
    
  }


  
}
