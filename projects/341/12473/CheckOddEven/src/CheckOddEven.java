
//Write a program called CheckOddEven which prints "Odd Number" 
//return true if the int variable "number" is odd, or return false otherwise.

public class CheckOddEven {

	public Boolean check(int num){
	
		//modify and complete the if-else
		if((num%2)==1){
			System.out.println("Odd Number");
			return true;
		}
		else{
			System.out.println("Not Odd Number");
			return false;
		}
	}
}
