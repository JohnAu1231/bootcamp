package com.bootcamp.bc2403;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)  // inject a set of annoution
public class CalculatorTest {

  @Mock
  private Cat cat;

  @Test
  void testCalculatorSum() {
    // Let/Assume "new Cat(8, 10).sum()).thenReturn(100)";
    
    Mockito.when(this.cat.sum(8, 10)).thenReturn(100);

    Calculator calculator = new Calculator(8, cat);
    int result = calculator.sum(); // -> new Cat(8,10)
    assertEquals(103, result);
  }
  
}
