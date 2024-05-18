package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SupermanSpyTest {
  
  @Spy // if cat has two method, could chose mock one only
  private Cat cat; // w/o spy mocked cat with all method called

  @InjectMocks // something like calling the constructor by putting mocked cat as param
  private Superman superman;

  @Test
  void testSum() {
    Mockito.when(cat.sum(98,10)).thenReturn(1);
    assertEquals(50, superman.sum(98));
    verify(cat,times(1)).sum(98,10);
  }

  @Test
  void testSum2() {
    Mockito.when(cat.sum(90,10)).thenReturn(0);
    assertEquals(99, superman.sum(94));
    verify(cat,times(1)).sum(94,10);
  }
}
