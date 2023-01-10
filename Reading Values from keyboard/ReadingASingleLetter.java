
import java.util.Scanner;

public class ReadingASingleLetter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your answer(YyNn) : ");
        char letter = sc.next().charAt(0);
        System.out.println("You entered the letter " + letter);
    }
}

