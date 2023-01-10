
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter an item name        : ");
        String name = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter an item price       : ");
        double price = sc2.nextDouble();

        Scanner sc3 =  new Scanner(System.in);
        System.out.print("Enter the number of items : ");
        int num2 = sc3.nextInt();

        System.out.println("The total price of the "+name+" is "+(price*num2));
    }
}
