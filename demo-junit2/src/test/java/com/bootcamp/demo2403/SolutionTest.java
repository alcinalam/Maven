package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class SolutionTest { // default per method
  
  // Testing Environment
  

  int x = 0; // instance variable

  @BeforeAll
  static void initialize () {
    System.out.println("Solution test: BeforeAll");
  }

  
  @BeforeEach // before each testing method
  void setup() {
    this.x = 100;
    System.out.println("SolutionTest: BeforeEach");
  }

  @AfterAll
  static void close(){
    System.out.println("SolutionTest : After All");
  }

  @AfterEach
  void afterEach() {
    System.out.println("SolutionTest: AfterEach");
  }

  @Test
  void TestX() {
    this.x++;
    assertEquals(101,this.x);
  }

  @Test
  void TestX2() {
    this.x++;
    assertEquals(101,this.x);
  }
  
  @Test
  void testSolution2() {
    assertEquals(0,new Solution(). getTotalCount(List.of()));
  }
}
