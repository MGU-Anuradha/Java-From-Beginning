import java.net.SocketTimeoutException;

public class MaxMin{
    public static void main(String[] args) {
       
         System.out.println("Data Type\t\tMax Value\t\tMin Value");
        System.out.println();

        System.out.println("byte\t\t\t"+Byte.MAX_VALUE+"\t\t\t"+Byte.MIN_VALUE);
        System.out.println("int\t\t\t"+ Integer.MAX_VALUE+"\t\t"+Integer.MIN_VALUE);
        System.out.println("short\t\t\t"+Short.MAX_VALUE+"\t\t\t"+Short.MIN_VALUE);
        System.out.println("long\t\t\t"+Long.MAX_VALUE+"\t"+Long.MIN_VALUE);
        System.out.println("float\t\t\t"+Float.MAX_VALUE+"\t\t"+Float.MIN_VALUE);
        System.out.println("double\t\t\t"+Double.MAX_VALUE+"\t"+Double.MIN_VALUE);
        System.out.println();
    }
}