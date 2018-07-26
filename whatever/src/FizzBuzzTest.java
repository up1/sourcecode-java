import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void เลขหนึ่งต้องได้ค่าเป็นหนึ่ง() {
        FizzBuzz2 fz = new FizzBuzz2();
        String result = fz.sendAndReturn(1);
        assertEquals("1", result);
    }
    
    @Test
    public void เลข2ต้องได้ค่าเป็น2() {
        FizzBuzz2 fz = new FizzBuzz2();
        String result = fz.sendAndReturn(2);
        assertEquals("2", result);
    }
    
    @Test
    public void เลข3ต้องได้ค่าเป็นFizz() {
        FizzBuzz2 fz = new FizzBuzz2();
        String result = fz.sendAndReturn(3);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void เลข4ต้องได้ค่าเป็น4() {
        FizzBuzz2 fz = new FizzBuzz2();
        String result = fz.sendAndReturn(4);
        assertEquals("4", result);
    }
    
    @Test
    public void เลข5ต้องได้ค่าเป็นBuzz() {
        FizzBuzz2 fz = new FizzBuzz2();
        String result = fz.sendAndReturn(5);
        assertEquals("Buzz", result);
    }
    
    @Test
    public void เลข6ต้องได้ค่าเป็นFizz() {
        FizzBuzz2 fz = new FizzBuzz2();
        String result = fz.sendAndReturn(6);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void เลข10ต้องได้ค่าเป็นBuzz() {
        FizzBuzz2 fz = new FizzBuzz2();
        String result = fz.sendAndReturn(10);
        assertEquals("Buzz", result);
    }
    
    @Test
    public void เลข15ต้องได้ค่าเป็นFizzBuzz() {
        FizzBuzz2 fz = new FizzBuzz2();
        String result = fz.sendAndReturn(15);
        assertEquals("FizzBuzz", result);
    }
    

}
