

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PowerOfThreeTest {
	private PowerOfThree pot;
	
	@Before
	public void setUp() throws Exception {
		pot = new PowerOfThree();
	}
	
	@Test
	public void testNormal1() {
		assertTrue(pot.isPowerOfThree(59049));
	}
	
	@Test
	public void testNormal2() {
		assertFalse(pot.isPowerOfThree(51));
	}

	@Test
	public void testOne() {
		assertTrue(pot.isPowerOfThree(1));
	}
}
