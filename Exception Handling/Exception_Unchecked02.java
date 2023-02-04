public class Exception_Unchecked02{
    static int a;
    static int b;
    static int c;
    public static void main(String[] args) {
        System.out.println("This line was executed-01");
        a = 10;
        //b =2;
        b=0;
        try {
            c = a/b; //exception line
        } catch (ArithmeticException ae) {
            // TODO: handle exception
             System.out.println("ERROR: "+ae.toString());
        }
       
        System.out.println("c = "+c);
        System.out.println("This line was also executed-02");

    }
}