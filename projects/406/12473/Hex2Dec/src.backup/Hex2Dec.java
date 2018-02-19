/**
 * Write a program called Hex2Dec to convert an input hexadecimal string into its equivalent decimal number. 
 * The equivalent decimal number for hexadecimal "1a" is 26 and "4E" is 78.
 * 
 * Notice that alphabets can either be lowercase or uppercase.
 * 
 * Tip: You do not need a big nested-if statement of 16 cases (or 22 considering the upper and lower letters).
 * Extract the individual character from the hexadecimal string, says c. If char c is between '0' to '9', 
 * you can get the integer offset via c-'0'.  
 * If c is between 'a' to 'f' or 'A' to 'F', the integer offset is c-'a'+10 or c-'A'+10.
 * 
 * Hint: You can use Math.pow(a, b) API to calculate a to the power of b
 */

public class Hex2Dec{
	
	public static int hex2Dec(String hex){
		String lowerHex = hex.toLowerCase();
		char[] singleWord = lowerHex.toCharArray();
		int decResult = 0;
		int bit = 0;
		for(int i = 0;i < lowerHex.length();i ++ ){
			if((singleWord[i]>='0')&&(singleWord[i]<='9')){
				bit = singleWord[i] - '0';
				decResult = decResult + bit*(int)Math.pow(16,singleWord.length-i-1);
			}else if(singleWord[i]=='a'){
				bit = singleWord[i] - 'a' + 10;
				decResult = decResult + bit*(int)Math.pow(16,singleWord.length-i-1);
			}else if(singleWord[i]=='b'){
				bit = singleWord[i] - 'a' + 10;
				decResult = decResult + bit*(int)Math.pow(16, singleWord.length-i-1);
			}else if(singleWord[i]=='c'){
				bit = singleWord[i] - 'a' + 10;
				decResult = decResult + bit*(int)Math.pow(16, singleWord.length-i-1);
			}else if(singleWord[i]=='d'){
				bit = singleWord[i] - 'a' + 10;
				decResult = decResult + bit*(int)Math.pow(16, singleWord.length-i-1);
			}else if(singleWord[i]=='e'){
				bit = singleWord[i] - 'a' + 10;
				decResult = decResult + bit*(int)Math.pow(16, singleWord.length-i-1);
			}else if(singleWord[i]=='f'){
				bit = singleWord[i] - 'a' + 10;
				decResult = decResult + bit*(int)Math.pow(16, singleWord.length-i-1);
			}
		}
		return decResult;
	}
}
