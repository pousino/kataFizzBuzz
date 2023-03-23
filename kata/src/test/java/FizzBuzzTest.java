import org.example.FizzBuzz;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    
    FizzBuzz fizzBuzz = new FizzBuzz();
    
    @Test
    public void testWithNumberOne() {
        fizzBuzz.fizzBuzz(1);
        assertEquals("Test avec valeur 1","1", fizzBuzz.fizzBuzz(1));
    }
    
    @Test
    public void testWithNumberTwo() {
        fizzBuzz.fizzBuzz(2);
        assertEquals("Test avec valeur 2","2", fizzBuzz.fizzBuzz(2));
    }
    
    @Test
    public void testWithNumberThree() {
        fizzBuzz.fizzBuzz(3);
        assertEquals("Test avec Fizz","Fizz", fizzBuzz.fizzBuzz(3));
    }
    
    @Test
    public void testAll(){
        for (int i = 1; i <= 100; i++) {
            fizzBuzz.fizzBuzz(i);
            if (i % 3 == 0 && i % 5 == 0) {
                assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(i));
            } else if (i % 3 == 0) {
                assertEquals("Fizz", fizzBuzz.fizzBuzz(i));
            } else if (i % 5 == 0) {
                assertEquals("Buzz", fizzBuzz.fizzBuzz(i));
            } else {
                assertEquals(String.valueOf(i), fizzBuzz.fizzBuzz(i));
            }
        }
    }
    
    @Test
    public void testAllNumbers() {
        IntStream.rangeClosed(1, 100).forEachOrdered(i -> {
            fizzBuzz.fizzBuzz(i);
            if (i % 3 == 0 && i % 5 == 0) {
                assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(i));
            } else if (i % 3 == 0) {
                assertEquals("Fizz", fizzBuzz.fizzBuzz(i));
            } else if (i % 5 == 0) {
                assertEquals("Buzz", fizzBuzz.fizzBuzz(i));
            } else {
                assertEquals(String.valueOf(i), fizzBuzz.fizzBuzz(i));
            }
        });
    }
    
    
    
}
