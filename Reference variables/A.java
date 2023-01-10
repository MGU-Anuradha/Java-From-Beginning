public class A{
    public static void main(String[] args) {

        A a1 = new A();
        System.out.println("a1.no = " + a1.getNo()); 
    }

    private int no =100; // non static variable member
    public int getNo(){ // non static method member
        return no;
    }
}