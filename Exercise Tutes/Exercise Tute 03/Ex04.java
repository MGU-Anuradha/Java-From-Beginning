

public class Ex04{
    public static void main(String[] args) {

        System.out.println("The result");
        int n1=1, n2=2,n3=0;
        System.out.print(n1+"\t"+n2);

        do{ 
            
            n3 = n1+n2;
            System.out.print("\t"+n3);
            n1=n2;
            n2=n3;

        } while(n3<100);
    }
}