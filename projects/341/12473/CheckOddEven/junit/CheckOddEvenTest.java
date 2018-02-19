import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CheckOddEvenTest {
	CheckOddEven checkOddEven;

	@Before
	public void setUp() throws Exception {
		checkOddEven = new CheckOddEven();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCheck() {
		Boolean isOdd = checkOddEven.check(7);
		assertEquals(true,isOdd);
		
		isOdd = checkOddEven.check(10);
		assertFalse(isOdd);
	}

}
