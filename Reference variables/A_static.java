public class A_static{
    
    private static int no =100; //  static variable member
    public static int getNo(){ //  static method member
        return no;
    }
    public static void main(String[] args) {

        System.out.println("no = " + getNo()); 
        System.out.println("no = " + A_static.getNo());
    }

    
}