import java.util.Scanner;


public class Ex07{
    public static void main(String[] args) {
        double value, discount;
        Scanner sc = new Scanner(System.in);
   

        System.out.print("Enter the bill value\t:-");
        value = sc.nextDouble();
    
        System.out.println("The result:");

        if(value>9001.00){
            discount = (value*0.012);
        }else if(value>6001.00){
            discount = (value*0.009);
        }else if(value>4001.00){
            discount = (value*0.006);
        }else if(value>2001.00){
            discount = (value*0.003);
        }else {
            discount = 0;
        }
    
            
        System.out.println("The new bill value is "+(value-discount));

        System.out.println("The discount amoint is "+discount);
                
    }
}


