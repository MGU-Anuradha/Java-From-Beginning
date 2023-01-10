public class TheNullReference{
	//static A a1;//global
	static A a1=new A();//global 
	public static void main(String[] args){
		System.out.println("a1 = "+a1);  //a1 = A@42f30e0a
	}
}
class A{
	
}