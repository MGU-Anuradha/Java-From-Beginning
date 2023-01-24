import java.util.Scanner;
public class AA{
	static int a;
	static int b;
	static int total;
	public static void main(String[] args){
		readData();
		addValues();
		displayTotal();
	}
	public static void readData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for a : ");
		a=sc.nextInt();
		System.out.print("Enter value for b : ");
		b=sc.nextInt();
	}
	public static void addValues(){
		total=a+b;
	}
	public static void displayTotal(){
		System.out.println("The total is "+total);
	}
}