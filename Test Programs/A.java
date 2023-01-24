public class A{
	public static void main(String[] args){
		System.out.println("no = "+A.getNo());
		//A a1 = new A();
		//System.out.println("a1.no = "+a1.getNo());
	}
	private static int no=100;//none static variable member
	public static int getNo(){//none static method member
		return no;
	}
}