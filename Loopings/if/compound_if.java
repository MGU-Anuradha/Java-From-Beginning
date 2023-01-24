//java code
//by Senaka Somaratne
//Compound if...then... statement
import java.util.Scanner;
public class compound_if{
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
		float avg=(tMarks+pMarks)/2;
		System.out.print(name+", your average is "+avg+" and you have ");
		//compound if
		if(avg>=80){
			if(avg>=90){
				System.out.print("\'A+\'");
			}else{
				System.out.print("\'A-\'");
			}
		}else if(avg>=60){
			if(avg>=70){
				System.out.print("\'B+\'");
			}else{
				System.out.print("\'B-\'");
			}
		}else if(avg>=40){
			if(avg>=50){
				System.out.print("\'C+\'");
			}else{
				System.out.print("\'C-\'");
			}
		}else{
			System.out.print("\'F\'");
		}
		System.out.println(" pass");
		System.out.println(" -------------------------------");
		System.out.println("|\tThe grading table\t|");
		System.out.println(" -------------------------------");
		System.out.println("|\tA+\t|  100 - 90\t|");
		System.out.println("|\tA-\t|   89 - 80\t|");
		System.out.println("|\tB+\t|   79 - 70\t|");
		System.out.println("|\tB-\t|   69 - 60\t|");
		System.out.println("|\tC+\t|   59 - 50\t|");
		System.out.println("|\tC-\t|   49 - 40\t|");
		System.out.println("|\tF \t|   39 - 00\t|");
		System.out.println(" -------------------------------");
		System.out.println("\n\n--END--\n");
	}

}

