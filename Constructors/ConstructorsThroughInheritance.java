class A{
	private String message;
	public A(){
		System.out.println("I am from A");
	}
	public A(String message){
		this.message=message;
		getMessageA();
	}
	public void getMessageA(){
		System.out.println("Message of A is "+message);
	}
}


class B extends A{
	private String message;
	public B(){
		//super();
		System.out.println("I am from B");
	}
	public B(String message){
		super(message);
		this.message=message;
		getMessageB();
	}
	public void getMessageB(){
		System.out.println("Message of B is "+message);
	}
}
class C  extends B{
	private String message;
	public C(){
		System.out.println("I am from C");
	}
	public C(String message){
		super(message);//super();
		this.message=message;
		getMessageC();
	}
	public void getMessageC(){
		System.out.println("Message of C is "+message);
	}
}
public class ConstructorsThroughInheritance{
	public static void main(String[] args){
		//C c1 = new C();
		C c2 = new C("Hello");
	}
}