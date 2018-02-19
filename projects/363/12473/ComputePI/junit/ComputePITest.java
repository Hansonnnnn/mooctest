import static org.junit.Assert.*;
import org.junit.Test;


public class ComputePITest {

	@Test
	public void testCompute() {
		
		double sum = ComputePI.compute();
		assertEquals(3.1415926,sum,0.0000001);
	}

}
