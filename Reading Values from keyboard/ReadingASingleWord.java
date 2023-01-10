import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;

public class ReadingASingleWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String name = sc.next();
        System.out.println("You name is " + name);
    }
}

