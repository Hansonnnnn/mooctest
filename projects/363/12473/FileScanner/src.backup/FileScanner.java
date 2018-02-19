import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 从标准输入流中读入一个int,一个double和一个字符串，内容如下（每行结尾都有一个换行符）：
 * 12
 * 33.44
 * Peter
 * 然后输出如下内容（同样每行结尾都有一个换行符）：
 * The integer read is 12
 * The floating point number read is 33.44
 * The String read is Peter
 * Hi! Peter, the sum of 12 and 33.44 is 45.44
 * 
 * Tips: 你有可能需要保留浮点数的精度，可以参考以下方法：
 * double number = 1.1111;
 * DecimalFormat df = new DecimalFormat("0.00");
 * String numStr = df.format(number); // "1.11"
 */
public class FileScanner {

	public static void print(){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		String name = sc.next();
		double num2 = sc.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		String num2Str = df.format(num2);
		
		System.out.println("The integer read is "+ num1);
		System.out.println("The floating point number read is "+ num2Str);
		System.out.println("The String read is "+ name);
		System.out.println("Hi! "+ name+" the sum of " + num1+" and " + num2Str + " is " + (num1+Integer.parseInt(num2Str)));
		
		
		
	}
}
