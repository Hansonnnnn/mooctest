
import static org.junit.Assert.*;

import org.junit.Test;

public class GradesAverageTest {
	@Test
	public void testComputeGradesAverage1() {
		GradesAverage info=new GradesAverage();
		int[] grades = {1,2,3,4,5};
		assertEquals(3.0, info.computeGradesAverage(grades), 0.000001);
	}
	
	@Test
	public void testComputeGradesAverage2() {
		GradesAverage info=new GradesAverage();
		int[] grades = {1,8};
		assertEquals(4.5, info.computeGradesAverage(grades), 0.000001);
	}
	
	@Test
	public void testComputeGradesAverage3() {
		GradesAverage info=new GradesAverage();
		int[] grades = {};
		assertEquals(0, info.computeGradesAverage(grades), 0.000001);
	}
}
