//java code
//by Senaka Somaratne
//Switch statement without break statement
import java.util.Scanner;
public class switch_without_break2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of a month (1 to 12): ");
		int monthNo;
		monthNo=sc.nextInt();
		System.out.print("For your month number ");
		switch(monthNo){
			case 3:
			case 5:
			case 7:System.out.println("The value "+value+" is in SET A.");break;
			case 30:
			case 50:
			case 70:System.out.println("The value "+value+" is in SET B.");break;
			case 300:
			case 500:
			case 700:System.out.println("The value "+value+" is in SET C.");break;
			default:System.out.println("The value "+value+" is not in any SET");
		}
		System.out.println("\n\n--END--\n");
	}
}

