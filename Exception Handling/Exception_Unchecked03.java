public class Exception_Unchecked03{
    static int a[] = new int[4];
    public static void main(String[] args) {
        System.out.println("This line was executed-01");
       
        for(int i=0; i<=4; i++){
        try {     
                a[i] = 10*i;
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
             System.out.println("ERROR: "+e.toString());
        }
    }

        System.out.println("This line was also executed-02");

        for(int i=0; i<4; i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}