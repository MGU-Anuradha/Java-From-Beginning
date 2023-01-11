import java.util.Scanner;


public class Ex06{
    public static void main(String[] args) {
        char letter;
        Scanner sc = new Scanner(System.in);
   

        System.out.print("Enter a letter\t:-");
        letter= sc.next().charAt(0);
    
        System.out.println("The result:");

    
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(letter + " is vowel");
                    break;
                default:
                    System.out.println(letter + " is consonant");
            }
        }
    }
    


