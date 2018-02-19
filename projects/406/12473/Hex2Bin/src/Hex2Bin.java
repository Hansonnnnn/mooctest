/**
 * Write a program called Hex2Bin to convert a hexadecimal string into its equivalent binary string.

 * input:
 * "1aBc"
 * 
 * output:
 * "0001101010111100"
 * 
 * tip - You can use an array as a lookup table:
 * {"0000", "0001", "0010", "0011",
 * "0100", "0101", "0110", "0111",
 * "1000", "1001", "1010", "1011",
 * "1100", "1101", "1110", "1111"};
 */

public class Hex2Bin{
	
	static String[] hexBits = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"};
	
	public static String hex3Bin(String hex){
		char[] singleWord = hex.toCharArray();
		String binStr = null;
		int bit[] = new int[hex.length()*4];
		for(int i = 0;i<singleWord.length;i++){
			bit[i] = singleWord[i] - '0';
			if((singleWord[i]=='a')||(singleWord[i]=='A')){
				bit[i] = 10;
			}else if((singleWord[i]=='b')||(singleWord[i]=='B'))
			{
				bit[i] = 11;
			}else if((singleWord[i]=='c')||(singleWord[i]=='C'))
			{
				bit[i] = 12;
			}else if((singleWord[i]=='d')||(singleWord[i]=='D'))
			{
				bit[i] = 13;
			}else if((singleWord[i]=='e')||(singleWord[i]=='E'))
			{
				bit[i] = 14;
			}else if((singleWord[i]=='f')||(singleWord[i]=='F'))
			{
				bit[i] = 15;
			}
			
		}
		for(int i = 0;i < singleWord.length;i++){
			
			int bits = bit[i];
			binStr = binStr + hexBits[bits];
			
		}
		binStr = binStr.substring(4);
 		return binStr;
	}
}