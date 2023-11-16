import org.example.FizzBuzz;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    
    private FizzBuzz fizzBuzz;
    
    @Before
    public void init() {
        fizzBuzz = new FizzBuzz();
    }
    
    @Test
    public void testWithNumberOne() {
        String result = fizzBuzz.check(1);
        
        assertEquals("Erreur",  "1", result);
        
    }
    
    @Test
    public void testWithNumberThree() {
        String result = fizzBuzz.check(3);
        assertEquals("Erreur",  "Fizz", result);
    }
    
    @Test
    public void testWithNumberFive() {
        String result = fizzBuzz.check(5);
        
        assertEquals("Erreur",  "Buzz", result);
    }
    
    
    @Test
    public void testWithNumberFifteen() {
        String result = fizzBuzz.check(15);
        
        assertEquals("Erreur",  "FizzBuzz", result);
    }
    
    @Test
    public void testAll() {
        IntStream.rangeClosed(1, 100).forEach(i -> test(i));
    }
    
    private void test(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            assertEquals("Erreur",  "FizzBuzz", fizzBuzz.check(i));
        } else if (i % 3 == 0) {
            assertEquals("Erreur",  "Fizz", fizzBuzz.check(i));
        } else if (i % 5 == 0) {
            assertEquals("Erreur",  "Buzz", fizzBuzz.check(i));
        } else {
            assertEquals("Erreur",  String.valueOf(i), fizzBuzz.check(i));
        }
    }
    
    
}
