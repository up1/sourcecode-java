import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void test2() {
        PrimeFactor p = new PrimeFactor();
        assertEquals("2", p.of(2));
        assertEquals("22", p.of(4));
        assertEquals("222", p.of(8));
    }
    
    @Test
    public void test3() {
        PrimeFactor p = new PrimeFactor();
        assertEquals("3", p.of(3));
        assertEquals("33", p.of(9));
    }
    
   

}