public class TestingThrowsExceptions04{
	static int no1 = 10;
	static int no2 = 0;
	public static void main(String[] args){
		//try{
			m1();
		//}catch(ArithmeticException e){
		//	System.out.println("ERROR 0 : "+e.toString());
		//}
		System.out.println("Is the line print?");
	}
	public static void m1() throws ArithmeticException{//written by A
		try{
			m2();
		}catch(ArithmeticException e){
			System.out.println("ERROR 1 : "+e.toString());
		}
	}
	public static void m2() throws ArithmeticException{//written by B
		//try{
			m3();
		//}catch(ArithmeticException e){
		//	System.out.println("ERROR 2: "+e.toString());
		//}		
	}
	public static void m3() throws ArithmeticException{//written by C
		//try{
			System.out.println("no1/no3 = "+no1/no2);
		//}catch(ArithmeticException e){
		//	System.out.println("ERROR 3: "+e.toString());
		//}
	}
}