
import static org.junit.Assert.*;

import org.junit.Test;

public class Hex2DecTest {
	@Test
	public void testHex2Dec1() {
		assertEquals(15,Hex2Dec.hex2Dec("f"));
	}
	
	@Test
	public void testHex2Dec2() {
		assertEquals(15,Hex2Dec.hex2Dec("F"));
	}
	
	@Test
	public void testHex2Dec3() {
		assertEquals(26,Hex2Dec.hex2Dec("1a"));
	}
}
