class A{
	public void m1(){
		System.out.println("Explain about default construtor.");
	}
}
public class DefaultConstructor{
	public static void main(String[] args){
		A a2 = new A();
		a2.m1();
		m2(new A());
	}
	public static void m2( A a1){
		a1.m1();
	}
}