package com.example;

import java.util.LinkedList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Customer {
  private String name;
  private List<Order> orders;

  public Customer (String name){
    name = this.name;
    orders = new LinkedList<>();
  }

  public void add(Order order) {
    orders.add(order);
  }
     
  public int orderCount(){
    return this.getOrders().size();
  }
     
  public boolean isVIP() {
    return this.orderCount() >= 10;
  }
  
  public static int orderCount (Customer customer) {
    return customer.orderCount ();
  }

}
