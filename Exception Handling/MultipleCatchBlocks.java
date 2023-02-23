import java.io.IOException;
public class MultipleCatchBlocks{
	static int no1=10;
	static int no2=0;
	static int no3;
	public static void main(String[] args){

		try{
			//int no3=no1/no2;
			//throw new NullPointerException();
			//throw new IOException();
			throw new InternalError();
			//System.out.println("no1/no2 = "+no3);
		}catch(ArithmeticException ex){
			System.out.println("ERROR-1 in line, \"int no3=no1/no2\"");
			System.out.println("no2 = "+no2);
			System.out.println("ERROR TYPE : "+ex.toString());
		}catch(RuntimeException ex){
			System.out.println("ERROR-2 TYPE : "+ex.toString());
		}catch(Exception ex){
			System.out.println("ERROR-3 TYPE : "+ex.toString());
		}catch(Throwable ex){
			System.out.println("ERROR-4 TYPE : "+ex.toString());
		}finally{
			System.out.println("This the finally block");
		}
		System.out.println("Is this line print?");
	}
}