public class MethodOverloading{
	public static void main(String[] args){
		m1();
		m1((byte)10);
		m1(12.45f);
		m1((byte)10,23.12f);
		m1(0.256f, (byte)100);
	}
	public static void m1(){
		System.out.println("I take no parameters.");
	}
	public static void m1(byte b1){
		System.out.println("I take byte parameter = "+b1);
	}
	public static void m1(float f1){
		System.out.println("I take float parameter = "+f1);
	}
	public static void m1(byte b1, float f1){
		System.out.println("I take two parameters byte and float = "+b1+", "+f1);
	}
	public static void m1(float f1, byte b1){
		System.out.println("I take two parameters float and byte = "+f1+", "+b1);
	}
}

//since we call the methods without creting objects, make them as static