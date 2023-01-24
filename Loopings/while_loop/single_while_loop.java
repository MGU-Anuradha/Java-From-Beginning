//java code
//by Senaka Somaratne
//Single while loop
import java.util.Scanner;
public class single_while_loop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an iteration value for the for loop : ");
		int iterationValue=sc.nextInt();
		//single while loop---------------------------------------
		int counter=1;
		while(counter<=iterationValue){
			System.out.println("The iteration round="+counter);
			counter++;
		}
		//--------------------------------------------------------
		System.out.println("--------------------------------------");
		System.out.println("Counter = "+counter);
		System.out.print("\n\n--END--\n");
	}
}
/*
	Do followings
	-------------

	1.	write a program to take your name as input. display your name 15 times using a for loop.
	2.	modify your program to display your names desired number of times.
*/

