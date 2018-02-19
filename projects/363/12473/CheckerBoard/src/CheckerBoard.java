//Write a program called CheckerBoard that displays the following n * n (n=7) checkerboard pattern using two nested for-loops.
//# # # # # # #\n
//# # # # # # #\n
//# # # # # # #\n
//# # # # # # #\n
//# # # # # # #\n
//# # # # # # #\n
//# # # # # # #\n
//Your program should use only three output statements, one EACH of the followings:
//System.out.print("# ");   // print # and a space, without newline
//System.out.print(" ");    // print a space, without newline
//System.out.print("\n");     // print a newline

public class CheckerBoard {

	public static void print(int size){
		// Use nested-loop for this program 
		for(int i = 0;i<size;i++){
			for(int j = 0;j<=size;j++){
				System.out.print("# ");
				if(j == size){
					System.out.print("\n");
				}
			}
		}
		// Use modulus 2 to find alternate lines
		
	}
}
