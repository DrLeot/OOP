import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    private Numbers Numbers;
    @BeforeEach
    public void setUp(){
        Numbers = new Numbers();
    }

    @Test
    public void testsimplemax(){
        assertEquals(10,Numbers.max(1,10),"should be 10");
        assertEquals(10, Numbers.max(1,5,10), "should be 10");
    }
    @Test
    public void testerrormax(){
        final ArrayList<Integer> testnumbers = new ArrayList<Integer>();
        assertEquals(0,Numbers.maxnth(testnumbers),"should be 0");
    }

    @Test
    public void testcomplexmax(){
        final ArrayList<Integer> testnumbers = new ArrayList<Integer>();
        testnumbers.add(1);
        testnumbers.add(1);
        testnumbers.add(4);
        testnumbers.add(5);
        testnumbers.add(10);
        assertEquals(10,Numbers.maxnth(testnumbers),"should be 10");
    }

    @Test
    public void testsimplemin(){
        assertEquals(7, Numbers.min(7,10),"should be 7");
    }

    @Test
    public void testnegativemax(){
        assertEquals(3,Numbers.max(-10,3), "should be 3");
    }

    @Test
    public void testnegativemin(){
        assertEquals(-10,Numbers.min(4,-10),"should be -10");
    }
}