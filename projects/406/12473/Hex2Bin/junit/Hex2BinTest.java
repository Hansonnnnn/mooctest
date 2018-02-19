
import static org.junit.Assert.*;

import org.junit.Test;

public class Hex2BinTest {

	@Test
	public void testHex3Bin1() {
		assertEquals("000000101111",Hex2Bin.hex3Bin("02f"));
	}

	@Test
	public void testHex3Bin2() {
		assertEquals("000000101111",Hex2Bin.hex3Bin("02F"));
	}
	
	@Test
	public void testHex3Bin3() {
		assertEquals("11110101",Hex2Bin.hex3Bin("f5"));
	}
}
