
import static org.junit.Assert.*;

import org.junit.Test;

public class Bin2DecTest {

	@Test
	public void testBin2Dec() {
		assertEquals(11,Bin2Dec.bin2Dec("1011"));
	}

	@Test
	public void testBin2Dec2() {
		assertEquals(2,Bin2Dec.bin2Dec("10"));
	}

	@Test
	public void testBin2Dec3() {
		assertEquals(10,Bin2Dec.bin2Dec("1010"));
	}

}
