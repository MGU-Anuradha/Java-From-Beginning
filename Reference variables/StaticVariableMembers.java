
public class StaticVariableMembers {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        //call the static member
        System.out.println("a1.a = "+ a1.a); //100
        System.out.println("a2.a = "+ a2.a); //100
        System.out.println("a3.a = "+ a3.a); //100

        System.out.println("-------------");

        //call the non static member
        System.out.println("a1.b = "+ a1.b); //200
        System.out.println("a2.b = "+ a2.b); //200
        System.out.println("a3.b = "+ a3.b); //200

        A.a = 1000;
        a1.b = 2000;

        System.out.println("============");

        System.out.println("a1.a = "+ a1.a); //1000
        System.out.println("a2.a = "+ a2.a); //1000
        System.out.println("a3.a = "+ a3.a); //1000

        System.out.println("-------------");

        //call the non static member
        System.out.println("a1.b = "+ a1.b); //2000
        System.out.println("a2.b = "+ a2.b); //200
        System.out.println("a3.b = "+ a3.b); //200


    }
}



class A{
    public static int a = 100;
    public int b = 200;
}
