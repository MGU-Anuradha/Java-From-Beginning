//java code
//by Senaka Somaratne
//Simple if... statement
import java.util.Scanner;
public class simple_if{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float pMarks, tMarks;
		System.out.print("Enter Theory Marks    : ");
		tMarks=sc.nextFloat();
		System.out.print("Enter Practical Marks : ");
		pMarks=sc.nextFloat();
		//simple if...

		if((tMarks+pMarks)/2>=50){
			System.out.println("Excellent Average Marks : "+(tMarks+pMarks)/2);
		}
		System.out.println("\n\n--END--\n");
	}
}
