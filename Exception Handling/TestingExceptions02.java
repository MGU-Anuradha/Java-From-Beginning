public class TestingExceptions02{
	public static void main(String[] args){
		int intArray[] = new int[5];
		try{
			intArray[5]=100;//index 0,1,2,3 and 4 are ok
			System.out.println("intArray[5] = "+intArray[5]);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("ERROR in line \"intArray[5]=100;\"");
			System.out.println("ERROR TYPE : "+ex.toString());
		}
		System.out.println("Is the line print?");
	}
}