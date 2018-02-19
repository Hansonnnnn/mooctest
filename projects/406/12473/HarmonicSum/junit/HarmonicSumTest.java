import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HarmonicSumTest {
	@Test
	public void testCalculateSumL2R() {
		double sumL2R = HarmonicSum.calculateSumL2R(50000);
		assertEquals(11.3970039,sumL2R,0.0000001);
	}

	@Test
	public void testCalculateSumR2L() {
		double sumR2L = HarmonicSum.calculateSumR2L(50000);
		assertEquals(11.3970039,sumR2L,0.0000001);
	}
}
