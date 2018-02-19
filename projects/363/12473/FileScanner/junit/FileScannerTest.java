import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.Test;


public class FileScannerTest {

	@Test
	public void testPrint1() throws Exception {
		String input = "12\n33.44\nPeter\n";
		String output = "The integer read is 12\nThe floating point number read is 33.44\nThe String read is Peter\nHi! Peter, the sum of 12 and 33.44 is 45.44\n";
		
		wrap(input, output, new Runnable() {
			@Override
			public void run() {
				FileScanner.print();
			}
		});
	}
	
	@Test
	public void testPrint2() throws Exception {
		String input = "40\n1.11\nSuzumiya\n";
		String output = "The integer read is 40\nThe floating point number read is 1.11\nThe String read is Suzumiya\nHi! Suzumiya, the sum of 40 and 1.11 is 41.11\n";
		
		wrap(input, output, new Runnable(){
			@Override
			public void run() {
				FileScanner.print();
				
			}
		});
	}
	
	private void wrap(String input, String output, Runnable action) throws Exception{
		PrintStream backupOut = System.out;
		InputStream backupIn = System.in;
		
		ByteArrayInputStream is = new ByteArrayInputStream(input.getBytes("utf-8"));
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		System.setIn(is);
		System.setOut(new PrintStream(os));
		
		action.run();
		
		assertEquals(output, os.toString("utf-8"));
		os.close();
		
		System.setIn(backupIn);
		System.setOut(backupOut);
	}
}
