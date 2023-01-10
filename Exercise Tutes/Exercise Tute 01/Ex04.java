
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the first value   : ");
        int num1 = sc1.nextInt();

        Scanner sc2 =  new Scanner(System.in);
        System.out.print("Enter the second value  : ");
        int num2 = sc2.nextInt();

        System.out.println("Total : "+(num1+num2));
    }
}
