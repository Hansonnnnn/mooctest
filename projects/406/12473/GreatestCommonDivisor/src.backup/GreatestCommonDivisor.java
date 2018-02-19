/**
 * Write a method called gcd() to compute the Greatest Common Dividor with the following signature:
 * public static int gcd(int a, int b)
 * You can assume that both a and b are greater than 0 and you can implement this method either recursively or iteratively.
 * 
 * By definition, gcd(a, b) is the greatest factor that divides both a and b.
 * Assume that a and b are positive integers, and a≥b, 
 * the Euclid algorithm is based on these two properties:
 * GCD(a, 0) = a
 * GCD(a, b) = GCD(b, a mod b), where (a mod b) denotes the remainder of a divides by b.
 * 
 * For example,
 * GCD(15, 5) = GCD(5, 0) = 5
 * GCD(99,88) = GCD(88,11) = GCD(11,0) = 11
 * GCD(3456,1233) = GCD(1233,990) = GCD(990,243) = GCD(243,18) = GCD(18,9) = GCD(9,0) = 9
 * 
 * The pseudocode for the Euclid algorithm is as follows:
 * GCD(a, b)    // assume that a ≥ b
 * while (b != 0) {
 * // Change the value of a and b: a ← b, b ← a mod b, and repeat until b is 0
 * temp ← b
 * b ← a mod b
 * a ← temp
 * }
 * // after the loop completes, i.e., b is 0, we have GCD(a, 0)
 * GCD is a
 */
public class GreatestCommonDivisor {
	public static int gcd(int a, int b) {
		int aAfterComporing = a;
		int bAfterComparing = b;
		int gcdResult = 0;
		boolean isBigger = (a >= b);
		if(!isBigger){
			aAfterComporing = b;
			bAfterComparing = a;
		}
		if(bAfterComparing == 0){
			gcdResult = aAfterComporing;
		}else{
			while(bAfterComparing != 0){
			int tempNum = bAfterComparing;
			bAfterComparing = aAfterComporing % bAfterComparing;
			aAfterComporing = tempNum;
		}
		gcdResult = aAfterComporing;
		}
		
		return gcdResult;
	}
}
