
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class GradesHistogramTest {

	@Test
	public void testHistogram1() throws Exception {
		String input = "15\n49 50 51 59 0 5 9 10 15 19 50 55 89 99 25";
		
		String output="";
		output+="0 - 9: ***\n";
		output+="10 - 19: ***\n";
		output+="20 - 29: *\n";
		output+="30 - 39: \n";
		output+="40 - 49: *\n";
		output+="50 - 59: *****\n";
		output+="60 - 69: \n";
		output+="70 - 79: \n";
		output+="80 - 89: *\n";
		output+="90 - 99: *\n";
		
		wrap(input, output, new Runnable() {
			@Override
			public void run() {
				GradesHistogram.histogram();
			}
		});
	}
	
	@Test
	public void testHistogram2() throws Exception {
		String input = "3\n7 20 88";
		
		String output="";
		output+="0 - 9: *\n";
		output+="10 - 19: \n";
		output+="20 - 29: *\n";
		output+="30 - 39: \n";
		output+="40 - 49: \n";
		output+="50 - 59: \n";
		output+="60 - 69: \n";
		output+="70 - 79: \n";
		output+="80 - 89: *\n";
		output+="90 - 99: \n";
		
		wrap(input, output, new Runnable() {
			@Override
			public void run() {
				GradesHistogram.histogram();
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
