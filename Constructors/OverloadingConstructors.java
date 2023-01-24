class Prices{
    private float currentPrice; //variable name
    
    //method members
    public void setCurrrentPrice(float currentPrice){

    }
    public float getCurrentPrice(){
        return currentPrice;
    }

    //overloading the default constructor
    public Prices(){
        currentPrice = 12.00f;
    }
    public Prices(float currentPrice){
        this.currentPrice = currentPrice;
    }
}


//-----------------------------------------------------------------------

public class OverloadingConstructors{
    public static void main(String[] args) {
        Prices price1 = new Prices();
        System.out.println("price = " + price1.getCurrentPrice()); //12.0
        Prices price2 = new Prices();
        System.out.println("price = " + price2.getCurrentPrice()); //12.0
        Prices price3 = new Prices(22.50f);
        System.out.println("price = " + price3.getCurrentPrice()); //22.5
        Prices price4 = new Prices(54.19f);
        System.out.println("price = " + price4.getCurrentPrice()); //54.19
    }
}