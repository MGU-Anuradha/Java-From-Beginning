
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter an Celsius value  : ");
        double Celsius = sc2.nextDouble();

        System.out.println("The Fahrenheit value is "+ ((9*Celsius/5)+32));
    }
}
