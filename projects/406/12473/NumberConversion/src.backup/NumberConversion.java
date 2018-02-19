/**
 * Exercise NumberConversion: Write a method call toRadix() which converts a positive integer from one radix into another. The method has the following header:
 * public static String toRadix(String in, int inRadix, int outRadix)  // The input and output are treated as String.
 * <p/>
 * toRadix("A1B2", 16, 2) will return  "1010000110110010"
 */
public class NumberConversion {
	public static String toRadix(String in, int inRadix, int outRadix) {
		assert inRadix == 2 || inRadix == 8 || inRadix == 10 || inRadix == 16;
		assert outRadix == 2 || outRadix == 8 || outRadix == 10 || outRadix == 16;
		
		String backStr = null;
		
		if(inRadix == outRadix){
			backStr = in;
		}else if((inRadix == 2)&&(outRadix == 8)){
			backStr = NumberConversion.bin2Oct(in);
		}else if((inRadix == 2)&&(outRadix == 10)){
			backStr = NumberConversion.bin2Dec(in);
		}else if((inRadix == 2)&&(outRadix == 16)){
			backStr = NumberConversion.bin2Hex(in);
		}else if((inRadix == 8)&&(outRadix == 2)){
			backStr = NumberConversion.oct2bin(in);
		}else if((inRadix == 8)&&(outRadix == 10)){
			backStr = NumberConversion.oct2dec(in);
		}else if((inRadix == 8)&&(outRadix == 16)){
			backStr = NumberConversion.oct2hex(in);
		}else if((inRadix == 10)&&(outRadix == 2)){
			backStr = NumberConversion.dec2bin(in);
		}else if((inRadix == 10)&&(outRadix == 8)){
			backStr = NumberConversion.dec2Oct(in);
		}else if((inRadix == 10)&&(outRadix == 16)){
			backStr = NumberConversion.dec2Hex(in);
		}else if((inRadix == 16)&&(outRadix == 2)){
			backStr = NumberConversion.hex2bin(in);
		}else if((inRadix == 16)&&(outRadix == 8)){
			backStr = NumberConversion.hex2oct(in);
		}else if((inRadix == 16)&&(outRadix == 10)){
			backStr = NumberConversion.hex2dec(in);
		}
		return backStr;
	}
	//将二进制先转换为十进制，在用java库中的方法将十进制转换为八进制
	public static String bin2Oct(String s){
		
		String octStr = null;
		String decStr = NumberConversion.bin2Dec(s);
		int temp = Integer.parseInt(decStr);
		octStr = Integer.toOctalString(temp);
		return octStr;
	}
	//将二进制先转换为十进制
	public static String bin2Dec(String s){
		char[] bit = s.toCharArray();
		String decStr = null;
		int temp = 0;
		for(int i = 0;i < bit.length;i ++ ){
			
			temp = temp + (bit[i] - '0')*(int)Math.pow(2,(bit.length-i-1));
		}
		decStr = String.valueOf(temp).toUpperCase();
		return decStr;
	}
	//将二进制先转换为十进制，在用java库中的方法将十进制转换为十六进制
	public static String bin2Hex(String s){

		String hexStr = null;
		String decStr = NumberConversion.bin2Dec(s);
		int temp = Integer.parseInt(decStr);
		hexStr = Integer.toHexString(temp).toUpperCase();
		return hexStr;
	}
	public static String oct2bin(String s){
		String decStr = NumberConversion.oct2dec(s);
		String binStr = Integer.toBinaryString(Integer.parseInt(decStr));
		return binStr;
	}
	public static String oct2dec(String s){
		char[] bit = s.toCharArray();
		String decStr = null;
		int temp = 0;
		for(int i = 0;i < bit.length;i++){
			temp = temp + (bit[i] - '0')*(int)Math.pow(8,bit.length-i-1);
		}
		decStr = String.valueOf(temp);
		return decStr;
	}
	public static String oct2hex(String s){
		String decStr = NumberConversion.oct2dec(s);
		String hexStr = Integer.toHexString(Integer.parseInt(decStr)).toUpperCase();
		return hexStr;
	}
	public static String dec2bin(String s){
		return Integer.toBinaryString(Integer.parseInt(s));
	}
	public static String dec2Oct(String s){
		return Integer.toOctalString(Integer.parseInt(s));
	}
	public static String dec2Hex(String s){
		return Integer.toHexString(Integer.parseInt(s)).toUpperCase();
	}
	public static String hex2bin(String s){
		String decStr = NumberConversion.hex2dec(s);
		String binStr = Integer.toBinaryString(Integer.parseInt(decStr));
		return binStr;
	}
	public static String hex2oct(String s){
		String decStr = NumberConversion.hex2dec(s);
		String octStr = Integer.toOctalString(Integer.parseInt(decStr));
		return octStr;
	}
	public static String hex2dec(String s){
		String lowerHex = s.toLowerCase();
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
		String decStr = String.valueOf(decResult);
		return decStr;
	}
	
}
