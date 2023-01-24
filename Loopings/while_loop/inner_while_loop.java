//java code
//by Senaka Somaratne
//inner while loop
import java.util.Scanner;
public class inner_while_loop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an iteration value for the outer for loop : ");
		int outer;
		outer=sc.nextInt();
		System.out.print("Enter an iteration value for the inner for loop : ");
		int inner;
		inner=sc.nextInt();
		System.out.println();
		//outer and inner while loop---------------------------------------
		int y=1;
		int x=1;
		while(y<=outer){
				x=y;
				while(x<=inner){
					//System.out.print("y="+y+":"+"x="+x+" ");
					System.out.print("* ");
					x++;
				}
				//x=1;
				System.out.println();
				y++;
		}
		//--------------------------------------------------------
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

