//java code
//by Senaka Somaratne
//inner For loop
import java.util.Scanner;
public class inner_for_loop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an iteration value for the outer for loop : ");
		int outer;
		outer=sc.nextInt();
		System.out.print("Enter an iteration value for the inner for loop : ");
		int inner;
		inner=sc.nextInt();
		System.out.println();
		//outre and inner for loops-----------
		for(int y=0;y<outer;y++){
		//for(int y=outer;y>=1;y--){
			//for(int x=1;x<=y;x++){
			for(int x=1;x<=inner-y;x++){
				//System.out.print("y="+y+":x="+x+" ");
				System.out.print("* ");
			}
			System.out.println();
		}
		//------------------------------------
		System.out.println("\n\n--END--\n");
	}
}
/*
	Do followings
	-------------
	1.	using outer and inner for loops, write a program to produce following output.
		
		* * * * * * * * * *
		* * * * * * * * * *
		* * * * * * * * * *
		* * * * * * * * * *
		* * * * * * * * * *
		* * * * * * * * * *
		* * * * * * * * * *
		* * * * * * * * * *
		* * * * * * * * * *
		* * * * * * * * * *

	2.	using outer and inner for loops, write a program to produce following output.

		*
		* *
		* * *
		* * * *
		* * * * *
		* * * * * *
		* * * * * * *
		* * * * * * * *
		* * * * * * * * *
		* * * * * * * * * *

	3.	using outer and inner for loops, write a program to produce following output.

		* * * * * * * * * *
		* * * * * * * * * 
		* * * * * * * * 
		* * * * * * * 
		* * * * * * 
		* * * * *
		* * * * 
		* * * 
		* * 
		*

	4.	using outer and inner for loops, write a program to produce following output.

		* * * * * * * * * *
		  * * * * * * * * 
		   * * * * * * * 
		     * * * * * 
		       * * * 
		       * * *
		     * * * * * 
		   * * * * * * * 
		 * * * * * * * * *
		* * * * * * * * * *
		
*/

