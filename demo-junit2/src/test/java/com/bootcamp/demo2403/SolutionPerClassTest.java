package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class SolutionPerClassTest {
  
  static int y = 0; // will updated anyway while test start
  int x = 0;

  @BeforeAll // before all test cases
  void setup() { // instance method -> update instance var/static var
    this.x = 100;
  }

  @BeforeEach
  void BeforeEach(){
    System.out.println("SolutionPerClassTest: BeforeEach()");
  }

  @AfterAll
  void close() {
    System.out.println("SolutionPerClassTest: AfterAll()");
  }

  @Test
  @Order(1)
  void testX () {
    this.x++;
    assertEquals(101,this.x);
  }

  @Test
  @Order(2)
  void testX2() {
    this.x++;
    assertEquals(102, this.x);
  }

  public static void main(String[] args) {
    SolutionPerClassTest st = new SolutionPerClassTest();
    st.x = 100;
    st.testX();
    st.testX2();
    System.out.println("x=" + st.x); //2
  }
}
