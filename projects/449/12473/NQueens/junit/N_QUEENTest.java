import static org.junit.Assert.*;
import org.junit.Test;

public class N_QUEENTest {
	
	@Test
	public void test1(){
		N_QUEEN nq = new N_QUEEN();
		assertEquals(true,nq.isN_QUEEN("d8,g7,c6,h5,b4,e3,a2,f1"));
	}
	
	@Test
	public void test2(){
		N_QUEEN nq = new N_QUEEN();
		assertEquals(true,nq.isN_QUEEN("a6,b4,c7,d1,e8,f2,g5,h3"));
	}
	
	@Test
	public void test3(){
		N_QUEEN nq = new N_QUEEN();
		assertEquals(true,nq.isN_QUEEN("a4,b2,c8,d5,e7,f1,g3,h6"));
	}
	
	@Test
	public void test4(){
		N_QUEEN nq = new N_QUEEN();
		assertEquals(false,nq.isN_QUEEN("a1,b2,c3,d4,e5,f6,g7,h8"));
	}

	@Test
	public void test5(){
		N_QUEEN nq = new N_QUEEN();
		assertEquals(false,nq.isN_QUEEN("a4,b2,c8,d5,e7,f1,g6,h3"));
	}
	
	@Test
	public void test6(){
		N_QUEEN nq = new N_QUEEN();
		assertEquals(true,nq.isN_QUEEN(nq.generateN_QUEEN()));
	}
}
