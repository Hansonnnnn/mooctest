/**
 * Write a program called HarmonicSum to compute the sum of a harmonic series which is like:
 * harmonic(n) = 1 + 1/2 + 1/3 + ... + 1/n
 * where n is an integer and n > 0
 *
 * The program shall compute the sum from left-to-right as well as from the right-to-left. 
 * Guess which one is more accurate?
 * 
 * FYI: One integer dividing another integer will possibly be lossy. Be careful about that.
 */
public class HarmonicSum {    
    public static double calculateSumL2R(int n){
    	double result = 0.0;
    	for(int i = n;i>0;i--){
    		result = result + (1.0/i);
    	}
    	return result;
    }
    
    public static double calculateSumR2L(int n){
    	double result = 0.0;
    	for(int i = 1;i<n+1;i++){
    		result = result + (1.0/i);
    	}
    	return result;
    }
}
