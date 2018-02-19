/*
Write a program called Bin2Dec to convert an input binary string into its equivalent decimal number. 

You can use JDK method Math.pow(x, y) to compute the x raises to the power of y. 
This method takes two doubles as argument and returns a double. You may have to cast the result back to int.

To convert a char (of digit '0' to '9') to int (0 to 9), simply subtract by char '0', e.g., '5'-'0' gives int 5.
 */

public class Bin2Dec{
	public static long bin2Dec(String binStr){
		int result = 0;
		char[] myBinStr = binStr.toCharArray();
		int length = myBinStr.length;
		for(int i = 0;i<length;i++){
			while(length>0){
			result = result + (myBinStr[i]-'0')*(int)Math.pow(2, (length-1));
			length--;
		}
		}
		
		return result;
	}
}
