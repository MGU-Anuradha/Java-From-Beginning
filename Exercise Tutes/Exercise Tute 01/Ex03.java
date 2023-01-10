
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc1.nextLine();

        Scanner sc2 =  new Scanner(System.in);
        System.out.print("Enter your age  : ");
        int age = sc2.nextInt();

        System.out.println(name + " your age is "+age);
    }
}
