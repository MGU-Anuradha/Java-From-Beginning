import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;

public class ReadingByteValue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a byte value : ");
        byte b = sc.nextByte();
        System.out.println("You entered the value " + b);
    }
}

