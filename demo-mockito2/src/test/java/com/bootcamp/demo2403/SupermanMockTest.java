package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SupermanMockTest {
  
  @Mock
  private Cat cat;

  @InjectMocks
  private Superman superman;

  @Test
  void testSum() {
    when(cat.sum(98,10)).thenReturn(2);
    when(cat.subtract(100, 98)).thenReturn(3);

    assertEquals(50, superman.sum(98));
    verify(cat,times(1)).sum(98,10);
    verify(cat,times(1)).subtract(100,98);
  }

  @Test
  void testSum2() {
    when(cat.sum(98,10)).thenReturn(3);
    when(cat.subtract(100, 98)).thenReturn(3);

    assertEquals(99, superman.sum(98));
    verify(cat,times(1)).sum(98,10);
    verify(cat,times(1)).subtract(100,98);
  }


}
