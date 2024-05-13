package com.example.parent;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode (callSuper = true)
public class Car extends BigCar {
  
  private String model;

  // public Car (String model){ <--parents need empty for super();
  //   super();  <-- implicity inherits
  //   this.model = model;
  // }

  // Custom Constructor
  public Car (String model, double weight) {
    super(weight);
    this.model = model;

  }

  public static void main(String[] args) {
    Car car = new Car("V8"); // AllargsConstructor of Car as constructor not inherits
    car.setWeight(10.0);
    System.out.println(car.getWeight());
    System.out.println(car.toString()); //@ToString ->Car(model=V8)
    System.out.println(car.toString()); //@ToString (callSuper = true) -> Car(super=BigCar(weight=10.0), model=V8)
    
    Car car2 = new Car("V8");
    car2.setWeight(10.0);
    System.out.println(car.equals((car2)));//true
  }
}
