package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
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
  
  int x = 0;

  @BeforeAll  // Before all test cases;
  void initalize() {
    this.x = 100;
    System.out.println("SolutionPerCalssTest: initalize()");
  }

  @BeforeEach
  void setup() {
    System.out.println("setup()");
  }

  @AfterAll
  void finalize2() {
    System.out.println("finalize()");
  }

  @AfterEach
  void final2() {
    System.out.println("final()");
  }

  @Test
  @Order(1)
  void testX() {
    this.x++;
    assertEquals(101, this.x);
  }
  @Test
  @Order(2)
  void testX2() {
    this.x++;
    assertEquals(102, this.x);
  }
//   SolutionPerCalssTest: initalize()
// setup()
// final()
// setup()
// final()
// finalize()
}
