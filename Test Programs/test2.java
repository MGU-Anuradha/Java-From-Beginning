public class test2 {
    private int no =10;
    public static void main(String[] args) {
        test2 test = new test2();
        test.m1();
    }

    public void m1(){
        boolean b;
        System.out.println(no);
        //System.out.println(b); --> error occurs

        //not compile, b is a local variable, so it should be initialized
    }
}
