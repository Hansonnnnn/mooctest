/*
 * Write a program called Arithmetic that takes three command-line arguments: 
 * two integers followed by an arithmetic operator (+, -, * or /)
 * if the expression's form is not right,output "wrong"
 *  
 * input:
 * "3 2 +"
 * output:
 * "3+2=5"
 */

public class Arithmetic {
	public static String arithmetic(String s) {
		StringBuilder output = new StringBuilder();
		if(s.length() != 5){
			output.append("wrong");
			return output.toString();
		}
		char[] input = s.toCharArray();
		if((input[0] == '/')|(input[2] == '/')){
			output.append("wrong");
			return output.toString();
		}
		switch(input[input.length-1]){
		case '+': output.append(input[0]).append(input[input.length-1]).append(input[2]).append("=").append(((input[0]-'0')+(input[2]-'0')));
				  break;
		case '-': output.append(input[0]).append(input[input.length-1]).append(input[2]).append("=").append(((input[0]-'0')-(input[2]-'0')));
				break;
		case '*': output.append(input[0]).append(input[input.length-1]).append(input[2]).append("=").append(((input[0]-'0')*(input[2]-'0')));
				break;
		case '/': output.append(input[0]).append(input[input.length-1]).append(input[2]).append("=").append(((input[0]-'0')/(input[2]-'0')));
				break;
		}
		return output.toString();
	}
	
	
}
