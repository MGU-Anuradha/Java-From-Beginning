import java.util.Scanner;

class Prices2{
    private float currentPrice; //variable name
    
    //overloading default constructor
    public Prices2(){
        setCurrrentPrice();
    }

    //method members
    public void setCurrrentPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price value : ");
        currentPrice = sc.nextFloat();
        giveMessage();

    }
    public float getCurrentPrice(){
        return currentPrice;
    }
    public void giveMessage(){
        System.out.println("our object has been created with the value " +getCurrentPrice());
    }

}


//-----------------------------------------------------------------------

public class OverloadingConstructors2{
    public static void main(String[] args) {
        Prices2 price1 = new Prices2();
    }
}