import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;

public class ReadingDoubleValue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double value : ");
        double b = sc.nextDouble();
        System.out.println("You entered the value " + b);
    }
}

