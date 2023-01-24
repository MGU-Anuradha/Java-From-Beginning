import java.util.Scanner;

public class OneDArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int elements = sc.nextInt();

        //declaring the arraya
        int no[] = new int[elements];

        //Assigning values to the array
        System.out.println("Enter values to the array");
        //for(int i=0; i<no.length; i++)
        for (int i=0; i<elements; i++){
            System.out.print("["+i+"]:");
            no[i] = sc.nextInt();
        }

        System.out.println();
        
        //displaying the values in array elements
        System.out.println("The values in the elements here");
        for (int i=0; i<elements; i++){
            System.out.println(no[i]+"\t");
        }

    }
}