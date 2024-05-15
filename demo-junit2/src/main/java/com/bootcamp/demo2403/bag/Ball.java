package com.bootcamp.demo2403.bag;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Ball {
  private int value;
  private Color color;

  public static Ball of (int value, Color color){
    return new Ball(value,color);
  }

  
}
