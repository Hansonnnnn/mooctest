import static org.junit.Assert.*;

import org.junit.Test;


public class KeyboardScannerTest {

	@Test
	public void testPrint() {
		double sum = KeyboardScanner.print();
		assertEquals(45.44,sum,0.01);
	}

}
