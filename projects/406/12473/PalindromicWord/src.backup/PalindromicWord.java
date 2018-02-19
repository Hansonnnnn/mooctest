/*A word that reads the same backward as forward is called a palindrome, e.g., "mom", "dad", "racecar", "madam", 
 * and "Radar" (case-insensitive). Write a program called TestPalindromicWord, 

A phrase that reads the same backward as forward is also called a palindrome, e.g., "Madam, I'm Adam", 
"A man, a plan, a canal - Panama!" (ignoring punctuation ,capitalization and space). 


*/
public class PalindromicWord{
	/**
	 * 判断s是否是回文
	 * @param s
	 * @return 真或假
	 */
	public static boolean isPalindromicWord(String s){
		
		
		String newLowerCaseStr = null;
		String[] pureStr = s.split(" ");
		for(int i = 0;i < pureStr.length;i++){
			newLowerCaseStr = newLowerCaseStr + pureStr[i];
		}
		newLowerCaseStr = newLowerCaseStr.toLowerCase().substring(4);
		System.out.println(newLowerCaseStr);
		int strLength =newLowerCaseStr.length();
		String reverseStr = null;
		boolean flag = true;
		for(int i = 0;i<strLength;i++){
			reverseStr = reverseStr + newLowerCaseStr.substring(strLength-i-1, strLength-i).toLowerCase();
		}
		reverseStr = reverseStr.substring(4);
		System.out.println(reverseStr);
		if(!newLowerCaseStr.equals(reverseStr)){
			flag = false;
		}
		return flag;
	}
}
