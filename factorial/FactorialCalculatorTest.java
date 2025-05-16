package factorial;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialCalculatorTest {

	@Test
	public void testFactorialOf0() {
	    assertEquals(1, FactorialCalculator.factorial(0));
	}

	@Test
	public void testFactorialOf1() {
	    assertEquals(1, FactorialCalculator.factorial(1));
	}

	@Test
	public void testFactorialOf5() {
	    assertEquals(120, FactorialCalculator.factorial(5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegativeNumberThrowsException() {
	    FactorialCalculator.factorial(-1);
	}


}
