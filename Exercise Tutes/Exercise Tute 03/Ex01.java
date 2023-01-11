import java.util.Scanner;

public class Ex01{
    public static void main(String[] args) {
        System.out.print("Enter table number\t:- ");

        int no;
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();

        System.out.print("Enter the level number\t:-");
        int level = sc.nextInt();

        System.out.println("The result");

        for(int x=1; x<=level;x++){
            System.out.println("5*"+x+"\t= "+(5*x));
        }
    }
}