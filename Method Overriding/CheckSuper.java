
class AB{
    public void mm1(String s){
        System.out.println("Hello1 "+s);
    }
}

class AB2 extends AB{
    public void mm1(String s){
        super.mm1("Ushani");
        System.out.println("Hello2 "+s);
    }
}


public class CheckSuper {
    public static void main(String[] args) {
        AB2 ab2 = new AB2();
        ab2.mm1("Anuradha");
    }
}
