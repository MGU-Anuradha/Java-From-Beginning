public class TestingExceptions05{
	public static void main(String[] args){
		int no1=10;
		int no2=0;
		try{
			int no3=no1/no2;
			System.out.println("no1/no2 = "+no3);
		}catch(ArithmeticException ex){
			System.out.println("ERROR in line, \"int no3=no1/no2\"");
			System.out.println("no2 = "+no2);
			System.out.println("ERROR TYPE : "+ex.toString());
		}finally{
			System.out.println("This is finally block");
		}
		System.out.println("Is this line print?");
	}
}