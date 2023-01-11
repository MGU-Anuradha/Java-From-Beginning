import java.util.Scanner;


public class Ex04{
    public static void main(String[] args) {
        int no1;
        Scanner sc = new Scanner(System.in);
   

        System.out.print("Enter the first value\t:-");
        no1 = sc.nextInt();
    
        System.out.println("The result:");

        if(no1>0){ 
            System.out.println("The number "+no1+" is a positive number");
        }else{
            System.out.println("The number "+no1+" is a negative number");
        }
    }
    
}

