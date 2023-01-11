import java.util.Scanner;


public class Ex01{
    public static void main(String[] args) {
        int no1, no2;
        Scanner sc = new Scanner(System.in);
   

        System.out.print("Enter the first value\t:-");
        no1 = sc.nextInt();
        System.out.print("Enter the second value\t:-");
        no2 = sc.nextInt();
    
        System.out.println("The result:");

        if(no1>no2){ 
            System.out.println("The maximum value is\t: "+ no1);
        }else{
            System.out.println("The maximum value is\t: "+ no2);
        }
    }
    
}

