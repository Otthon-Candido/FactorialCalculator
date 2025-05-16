package factorial;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialCalculatorTest {

	@Test
	public void testFactorialOf0() {
	    assertEquals(1, FactorialCalculator.factorial(0));
	}

}
