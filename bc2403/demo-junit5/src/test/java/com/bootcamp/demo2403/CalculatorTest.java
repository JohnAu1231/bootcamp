package com.bootcamp.demo2403;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// We can use static import to import all static methods of the Class
public class CalculatorTest {


    @ParameterizedTest
    @CsvSource({
        "2, 1, 2",
        "100, 49, 50"
    })


    @Test
    void testSum() {
        // Assertions.assertEquals(5,Calculator.sum(3,2));
        //becuase static import
        // import static org.junit.jupiter.api.Assertions.*;
        // normally import org.junit.jupiter.api.Assertions;
        // need Assetions. 
        assertEquals(5,Calculator.sum(3,2));
        int actual = Calculator.sum(3, 4);
        assertEquals(7,actual);

        assertNotEquals(8, actual);
    }
    @Test
    void testSubtractrue() {
        assertEquals(8, Calculator.subtract(-1,-9));
    }

    @Test 
    void testSort() {
        int[] arr = new int[] {2,4,3,1};
        Calculator.sort(arr);
        Assertions.assertArrayEquals(new int[] {1,2,3,4}, arr) ;
    }

    // @Test
    // void testTimeOut() {
    //     assertTimeout(Duration.ofMillis(500), () -> {
    //         for (int i = 0; i < 1000000; i++) {
    //             System.out.println("hello");
    //         }
    //     });

}
