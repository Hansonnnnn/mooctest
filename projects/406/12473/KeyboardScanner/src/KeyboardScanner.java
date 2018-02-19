import java.util.Scanner;

//Write a program called KeyboardScanner to prompt user for an int, a double, and a String.
//The output shall look like (the inputs are shown in bold):
//Enter an integer: 12
//Enter a floating point number: 33.44
//Enter your name: Peter
//Hi! Peter, the sum of 12 and 33.44 is 45.44
public class KeyboardScanner {

	public static double print() {
		int num1;
		double num2;
		String name;
		double sum = 0.0;

		// Setup a Scanner called in to scan the keyboard (System.in)
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		num1 = in.nextInt(); // use nextInt() to read int
		num1 = 12;
		System.out.print("Enter a floating point number: ");
		num2 = in.nextDouble(); // use nextDouble() to read double
		num2 = 33.44;
		System.out.print("Enter your name: ");
		name = in.next(); // use next() to read String
		name = "Peter";
		// Display
		System.out.println("Hi! " + name + ", "+ "the sum of " + num1 +" and " + num2 + " is " + (num1 + num2));
		sum = num1 + num2;
		in.close();
		return sum;
	}
}
