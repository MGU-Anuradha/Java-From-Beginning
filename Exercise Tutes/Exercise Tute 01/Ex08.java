import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {

        System.out.println("+---------------------+");
        System.out.println("|      MAIN MENU      |");
        System.out.println("+---------------------+");
        System.out.println("|1.Insert a Record    |");
        System.out.println("|2.Display a Record   |");
        System.out.println("|3.Display all Records|");
        System.out.println("|4.Edit a Record      |");
        System.out.println("|5.Delete a Record    |");
        System.out.println("|6.Exit               |");
        System.out.println("+---------------------+");

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice (1/2/3/4/5/6) : ");
        int choice = sc.nextInt();
        System.out.println("My choice is : " + choice);
    }
}
