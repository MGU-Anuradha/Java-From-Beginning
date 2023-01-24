//java code
//by Senaka Somaratne
//Switch statement without break statement
import java.util.Scanner;
public class switch_without_break{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of a month (1 to 12): ");
		int monthNo;
		monthNo=sc.nextInt();
		System.out.print("For your month number ");
		switch(monthNo){
			case 1:
			case 3:
			case 5:
			case 7:
			case 10:
			case 12:System.out.println("has 31 days.");break;
			case 4:
			case 6:
			case 8:
			case 9:
			case 11:System.out.println("has 30 days.");break;
			case 2:System.out.println("has 28 or 29 days.");break;
			default:System.out.println("a month is not available.");
		}
		System.out.println("\n\n--END--\n");
	}
}

