public class TestingExceptions03{
	//static A a1= new A();;
	static A a1;
	public static void main(String[] args){
		try{
			System.out.println("a1.no = "+a1.no);
		}catch(NullPointerException e){
			System.out.println("ERRIR in line \"System.out.println(\"a1.no = \"+a1.no);\"");
			System.out.println("ERROR TYPE : "+e.toString());
			System.out.println("ERROR TYPE : "+e);
			System.out.println("ERROR TYPE : "+e.getMessage());
			System.out.print("ERROR TYPE : ");
			e.printStackTrace();
			System.out.println("---------------------------------------");
			e.getCause();
		}
		System.out.println("Is the line print?");
	}
}
class A{
	public int no=100;
}