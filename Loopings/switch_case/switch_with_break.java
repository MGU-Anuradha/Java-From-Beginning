//java code
//by Senaka Somaratne
//Switch statement with break statement
import java.util.Scanner;
public class switch_with_break{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of a month (1 to 12) : ");
		int monthNo;
		monthNo=sc.nextInt();
		System.out.print("For your number, ");
		switch(monthNo){//only byte,short,int,enum and char can be used here
						//float, double and long types can not be applied in switch
			case 1:System.out.println("the month is January." );break;
			case 2:System.out.println("the month is February." );break;
			case 3:System.out.println("the month is March." );break;
			case 4:System.out.println("the month is April." );break;
			case 5:System.out.println("the month is May." );break;
			case 6:System.out.println("the month is June." );break;
			case 7:System.out.println("the month is July." );break;
			case 8:System.out.println("the month is August." );break;
			case 9:System.out.println("the month is September." );break;
			case 10:System.out.println("the month is October." );break;
			case 11:System.out.println("the month is November." );break;
			case 12:System.out.println("the month is December." );break;
			default:System.out.println("a month is not available." );//This is optional, No matching case is found this line is executed
		}
		System.out.println("\n\n--END--\n");
	}
}

