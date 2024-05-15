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
public class Circle implements Shape {
  
  private double radius;

  @Override
  public double area() {
    return Math.round(BigDecimal.valueOf(this.radius) //
      .multiply(BigDecimal.valueOf(this.radius)) //
      .multiply(BigDecimal.valueOf(Math.PI)) //
      .doubleValue());
  }

  @Override
  public void print() {
    System.out.println("This is a circle, the input is "//
     + getRadius() + " and the area is " + this.area());
    
  }

 

  
}
