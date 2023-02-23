import java.util.Scanner;
public class OwnException{
	static Scanner sc;
	public static void main(String[] args){
		char ans=' ';
		while(true){
			sc=new Scanner(System.in);
			System.out.print("Enter name : ");
			String name = sc.nextLine();
			System.out.print("Enter practical marks :");
			int p_marks;
			while(true){
				try{
					p_marks=sc.nextInt();
					if(p_marks<0||p_marks>100){
						throw new ValueErrorException();
					}else{
						break;
					}
				}catch(ValueErrorException ex){
					System.out.print(ex.toString());
				}
			}
			System.out.print("Enter theory marks :");
			int t_marks;
			while(true){
				try{
					t_marks=sc.nextInt();
					if(t_marks<0||t_marks>100){
						throw new ValueErrorException();
					}else{
						break;
					}
				}catch(ValueErrorException ex){
					System.out.print(ex.toString());
				}
			}
			int total = p_marks+t_marks;
			float avg = total/2;
			System.out.println("Total is "+total);
			System.out.println("Avg is "+avg);
			System.out.print("\n\n...Continue?(YyNn): ");
			do{
				try{
					ans=sc.next().charAt(0);
					if(ans=='Y'||ans=='y'||ans=='N'||ans=='n')
						break;
					else{
						throw new LetterErrorException();
					}	
				}catch(LetterErrorException e){
					System.out.print(e.toString());
				}
			}while(true);
			if(ans=='N'||ans=='n'){
				break;
			}
		}
		System.out.println("Program is over.");
	}
}


//Creting exceptions

class ValueErrorException extends Exception{
	public String toString(){
		return "Enter value between 1 and 100 :";
	}
}
class LetterErrorException extends Exception{
	public String toString(){
		return "Enter YyNn : ";
	}
}