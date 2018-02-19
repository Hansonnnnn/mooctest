import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberConversionTest {

	@Test
	public void testToRadix() throws Exception {
		assertEquals("1010000110110010", NumberConversion.toRadix("A1B2", 16, 2));
		assertEquals("A1B2", NumberConversion.toRadix("1010000110110010", 2, 16));
		assertEquals("4", NumberConversion.toRadix("100", 2, 10));
		assertEquals("64", NumberConversion.toRadix("100", 8, 10));
	}
}