import java.util.Scanner;


public class Ex03{
    public static void main(String[] args) {
        int no1;
        Scanner sc = new Scanner(System.in);
   
        System.out.print("Enter a value\t:-");
        no1 = sc.nextInt();
        
    
        System.out.println("The result:");

        if(no1%2 == 0){ 
            System.out.println("The number "+no1+" is an even number");
        }else{
            System.out.println("The number "+no1+" is an odd number");
        }
    }
    
}

