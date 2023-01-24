import java.util.Scanner;
public class AAAA{
	public static void main(String[] args){
		Input 	in = new Input();
		Process pr = new Process();
		Output 	ou = new Output();
		ou.displayTotal(pr.addValues(in.readData1(),in.readData2()));
	}
}
class Input{
	int a,b;
	Scanner sc = new Scanner(System.in);
	public int readData1(){
		System.out.print("Enter value for a : ");
		a=sc.nextInt();
		return a;
	}
	public int readData2(){
		System.out.print("Enter value for b : ");
		b=sc.nextInt();
		return b;
	}
}
class Process{
	int total;
	public int addValues(int a1,int b1){
		total=a1+b1;
		return total;
	}
}
class Output{
public void displayTotal(int sum){
		System.out.println("The total is "+sum);
	}
}