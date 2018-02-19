import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {
	@Test
	public void testGcd1() throws Exception {
		assertEquals(5, GreatestCommonDivisor.gcd(5, 15));
	}
	
	@Test
	public void testGcd2() throws Exception {
		assertEquals(11, GreatestCommonDivisor.gcd(99, 88));
	}
	
	@Test
	public void testGcd3() throws Exception {
		assertEquals(9, GreatestCommonDivisor.gcd(3456, 1233));
	}
}