
class A{
    public A(){
        System.out.println("I'm from A");
    }
}


class B extends A{
    public B(){
        System.out.println("I'm from B");
    }
}

class C extends B{
    public C(){
        System.out.println("I'm from C");
    }
}



public class ConstructorChain {
    public static void main(String[] args) {
        C c1 = new C();
    }
}
