package africa.semicolon.chapterSevenExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesTest {
    @Test
    void testFibonacciMapImpl(){
        assertEquals(5, FibonacciSeries.fibonacciMap(5));
        assertEquals(55, FibonacciSeries.fibonacciMap(10));
    }

    @Test
    void testFibonacciArrayImpl(){
        assertEquals(5, FibonacciSeries.fibonacciArray(5));
        assertEquals(55, FibonacciSeries.fibonacciArray(10));
    }

}