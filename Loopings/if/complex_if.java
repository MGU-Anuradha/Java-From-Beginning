//java code
//by Senaka Somaratne
//Complex if...statement
import java.util.Scanner;
public class complex_if{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float pMarks, tMarks;
		String name;
		System.out.print("Enter your name\t\t: ");
		name=sc.nextLine();
		System.out.print("Enter Theory Marks\t: ");
		tMarks=sc.nextFloat();
		System.out.print("Enter Practical Marks\t: ");
		pMarks=sc.nextFloat();
		//complex if...
		float avg=(tMarks+pMarks)/2;
		System.out.print(name+", your average is "+avg+" and you have ");
		if(avg>=80){
			System.out.println("\'A\' pass");
		}else if(avg>=60){
			System.out.println("\'B\' pass");
		}else if(avg>=40){
			System.out.println("\'C\' pass");
		}else{
			System.out.println("\'F\' pass");
		}
		System.out.println("+-------------------------------+");
		System.out.println("|\tThe grading table\t|");
		System.out.println("+-------------------------------+");
		System.out.println("|\tA\t|  100 - 80\t|");
		System.out.println("|\tB\t|   79 - 60\t|");
		System.out.println("|\tC\t|   59 - 40\t|");
		System.out.println("|\tF\t|   39 - 00\t|");
		System.out.println("+-------------------------------+");
		System.out.println("\n\n--END--\n");
	}

}
/*
	Do followings
	-------------
	1.	Write a program to input prices of 3 items. consider following table
			 ---------------------------------------------------------
			|         average price                        | discount | 
			 ---------------------------------------------------------
			| less than 100 and greater than 50            |   0.5%   |
			| less than 200 and greater than or equals 100 |   1.0%   |
			| equal or greater than 200                    |   2.0%   |
			 ---------------------------------------------------------  
*/
