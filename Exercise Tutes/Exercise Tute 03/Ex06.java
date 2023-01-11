import java.util.Scanner;

public class Ex06{
    public static void main(String[] args) {
        System.out.println("Enter the ten values");

        Scanner sc = new Scanner(System.in);
        int value,max=0,min=0;
        double total = 0;


        for(int x=1;x<=10;x++){
            System.out.print("("+x+").");
            value = sc.nextInt();
            
            if(x==1){
                max=value;
                min=value;
            }else{
                if(max<value){
                   max = value;
                }
                if(min>value){
                    min=value;
                }
            }


            total=total+value;
        }

        System.out.println("The result");
        System.out.println("Total\t: "+(int)total);
        System.out.println("Average\t: "+(total/10));
        System.out.println("Maximum\t: "+max);
        System.out.println("Minimum\t: "+min);


    }
}