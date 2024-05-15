package com.bootcamp.demo2403;

// static import "static頭 + 尾 *"
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import com.bootcamp.demo2403.bag.Bag;

// We can use static import to import all static method of the Class. 
class CalculatorTest { // only for testcase, w/o public

  @Test
  void testSum() {
    int actual = Calculator.sum(3,4);
    assertEquals(7, actual);// direct checking

    assertNotEquals(8,Calculator.sum(3,4)); // reverse checking
  }

    // Test-Driven Design
    @Test
    void testSubtract(){
      assertEquals(8,Calculator.subtract(-1, -9));
    }



  @Test
    void testSort() {
    int[] arr = new int[] {2, 4, 3, 1};
    Calculator.sort(arr);
      assertArrayEquals(new int[] {1, 2, 3, 4}, arr);

    int[] arr2 = new int [] {};
    Calculator.sort(arr2);
      assertArrayEquals(new int[] {}, arr2);
  }

  @ParameterizedTest
  @CsvSource({
    "2,1,1",
    "100,49,51"
  })
  void testSumEquals(int expected, int x, int y) {
    assertEquals(expected, Calculator.sum(x,y));
  }

  @ParameterizedTest
  @CsvSource({
    "2,1,3",
    "100,49,50"
    
  })
  void testSumNotEquals(int expected, int x, int y) {
    assertNotEquals(expected, Calculator.sum(x,y));
  }




  
}
