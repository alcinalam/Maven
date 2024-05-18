package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
  
  @Mock
  private Cat mockedCat; //

  @Test
  void testCalculatorSum() {
    // assume"Cat.sum(8,10)", return 100
    // cat.sum() testing already completed in CatTest.java
    // therefore here only focus on Calulator own logica (sth + 3)
    Mockito.when(this.mockedCat.sum(8,10)).thenReturn(100);

    Calculator calculator = new Calculator(8, mockedCat);
    int result = calculator.sum(); // -> new Cat (8,10).sum()
    assertEquals(103, result);// 100 + 3 , not 21

    // verifty() is to ensure calculator.sum() had called the mocked method
    verify(this.mockedCat,times(1)).sum(8,10);
  }


  
}
