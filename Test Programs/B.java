
class A{

}

public class B {
    public static void main(String[] args) {
        B b1 = new B();
        b1.m1();
    }

    A a;

    public void m1(){
        System.out.println(a); // output -> null
    }
}
