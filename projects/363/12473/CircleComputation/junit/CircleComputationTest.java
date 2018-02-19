import static org.junit.Assert.*;

import org.junit.Test;

public class CircleComputationTest {

	@Test
	public void testArea1() {
		CircleComputation circleComputation=new CircleComputation();
		assertEquals(4.5239,circleComputation.area(1.2),0.0001);
	}

	@Test
	public void testArea2() {
		CircleComputation circleComputation=new CircleComputation();
		assertEquals(0.0,circleComputation.area(0),0.1);
	}

	@Test
	public void testPerimeter() {
		CircleComputation circleComputation=new CircleComputation();
		assertEquals(7.5398223686155035,circleComputation.perimeter(1.2),0.00000000001);
	}

}
