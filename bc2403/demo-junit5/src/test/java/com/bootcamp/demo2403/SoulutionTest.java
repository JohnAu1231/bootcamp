package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SoulutionTest {
  int x = 0;

  @BeforeAll
  static void initialize() {
    System.out.println("SolutionTset: initalize()");
  }

  @BeforeEach   //before each testing method
  void setup() {
    this.x = 100;
    System.out.println("SolutionTset: setup()");
  }

  @AfterAll
  static void finalize2() {
    
    System.out.println("finalize()");
  }

  @AfterEach
  void final2() {
    System.out.println("final()");
  }

  @Test
  void testX() {
    this.x++;
    assertEquals(101, this.x);
  }
  @Test
  void testX2() {
    this.x++;
    assertEquals(101, this.x);
  }

// SolutionTset: initalize()
// SolutionTset: setup()
// final()
// SolutionTset: setup()
// final()
// finalize()
}
