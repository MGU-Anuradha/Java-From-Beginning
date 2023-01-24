//java code
//by Senaka Somaratne
//Default if...then... statement
import java.util.Scanner;
public class default_if{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float pMarks, tMarks;
		System.out.print("Enter Theory Marks\t: ");
		tMarks=sc.nextFloat();
		System.out.print("Enter Practical Marks\t: ");
		pMarks=sc.nextFloat();;
		//default if...

		if((tMarks+pMarks)/2>=50){
			//true part
			System.out.println("Excellent Average Marks\t: "+(tMarks+pMarks)/2);
		}else{
			//false part
			System.out.println("Poor average Marks\t: "+(tMarks+pMarks)/2);
		}
		System.out.println("\n\n--END--\n");
	}
}
/*
	Do followings
	-------------
	1.	Write a program to find out a given number is odd number or even number
	2.	Write a program to find out a given number is a negative or a possitive number
	3.	write a program to find out a given letter is a vowel or a consenent letter 
*/
