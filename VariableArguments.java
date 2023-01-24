public class VariableArguments{
	public static void main(String[] args){
		m1(10,24,45,67);
		m1(250);
	}
	public static void m1(int...a){
		if(a.length==0){
			System.out.println("No arguments have been passed.");
		}else{
			System.out.print("you have passed "+a.length+" arguments they are");
			for(int i=0;i<a.length;i++){
				System.out.print(", "+a[i]);
			}
		}
		System.out.println();
	}
}