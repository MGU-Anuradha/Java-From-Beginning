//java code
//by Senaka Somaratne
//inner do while loop
import java.util.Scanner;
public class inner_do_while_loop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an iteration value for the outer for loop : ");
		int outer;
		outer=sc.nextInt();
		System.out.print("Enter an iteration value for the inner for loop : ");
		int inner;
		inner=sc.nextInt();
		System.out.println();
		//outer and inner do loop---------------------------------------
		int y=1;
		int x=1;
		do{
				x=1;
				do{
					System.out.print("* ");
					x++;
				}while(x<=y);
				System.out.println();
				y++;
		}while(y<=outer);
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

