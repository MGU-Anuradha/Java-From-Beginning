public class AbstractTest{
    public static void main(String[] args) {
        Test2 test = new Test2();
        test.setName("Nimal");
        System.out.println("Name is : "+test.getName());

        test.setPasscode(1234);
        System.out.println("The passcode is : " + test.getPasscode());
    }
}

class Test2{
    private String name;
    private int passcode;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPasscode(int passcode){
        this.passcode = passcode;
    }

    public int getPasscode(){
        return passcode;
    }
}