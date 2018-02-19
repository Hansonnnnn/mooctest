import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;


public class CozaLozaWozaTest {

	@Test
	public void testPrint1() throws Exception {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
		System.setErr(new PrintStream(errorStream));

		CozaLozaWoza.print(1,11);
		assertEquals("1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11\n", outputStream.toString("utf-8"));

	}

	@Test
	public void testPrint2() throws Exception {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
		System.setErr(new PrintStream(errorStream));

		CozaLozaWoza.print(1,15);
		assertEquals("1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11\nCoza 13 Woza CozaLoza", outputStream.toString("utf-8"));
	}


}
