 class SuperClass {
    public final void m1(){
        System.out.println("from class Super");
    }
}

/*class Sub extends SuperClass {
    public void m1(){
       System.out.println("from class Sub"); 
    }
}*/

public class CheckFinal{
    public static void main(String[] args) {
        //Sub s = new Sub();
        //s.m1();Cannot override the final method from Super

        SuperClass s2 = new SuperClass();
        s2.m1();
    }
}


