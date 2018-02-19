import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticTest {

	@Test
	public void testArithmetic1() {
		assertEquals("4+5=9", Arithmetic.arithmetic("4 5 +"));
		
	}

	@Test
	public void testArithmetic2() {		
		assertEquals("4-5=-1", Arithmetic.arithmetic("4 5 -"));
	}

	@Test
	public void testArithmetic3() {
		assertEquals("4*5=20", Arithmetic.arithmetic("4 5 *"));
	}

	@Test
	public void testArithmetic4() {
		assertEquals("4/5=0", Arithmetic.arithmetic("4 5 /"));
	}

	@Test
	public void testArithmetic5() {
		assertEquals("wrong", Arithmetic.arithmetic("4 5 / /"));
	}

	@Test
	public void testArithmetic6() {
		assertEquals("wrong", Arithmetic.arithmetic("4 / 5"));
	}

}
