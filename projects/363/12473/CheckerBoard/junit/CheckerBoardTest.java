import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;


public class CheckerBoardTest{


	@Test
	public void testPrint() throws Exception {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		
		CheckerBoard.print(2);
		assertEquals("# #\n# #\n",outputStream.toString("utf-8"));
	}
	
	@Test
	public void testPrint2() throws Exception {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		
		CheckerBoard.print(7);
		assertEquals("# # # # # # #\n"+
"# # # # # # #\n"+
"# # # # # # #\n"+
"# # # # # # #\n"+
"# # # # # # #\n"+
"# # # # # # #\n"+
"# # # # # # #\n"
,outputStream.toString("utf-8"));
	}

}
