class C{

}

class D extends C{

}

public class A extends D{
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.toString()); //memory address of the object  in a1 reference 
    }
}