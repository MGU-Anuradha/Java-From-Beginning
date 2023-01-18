class GrandFather{
	private String grandFather="I am doing the roles of the Grand father";
	public void doGrandFatherRoles(){
		System.out.println(grandFather);
	}
}
class  Father extends GrandFather{
	private String father="I am doing the roles of the Father";
	public void doFatherRoles(){
		System.out.println(father);
	}	
}
class Husband extends Father{
	private String husband="I am doing the roles of the Husband";
	public void doHusbandRoles(){
		System.out.println(husband);
	}
}
class Employer extends Husband{
	private String employer="I am doing the roles of the Employer";
	public void doEmloyerRoles(){
		System.out.println(employer);
	}
}
class  Student extends Employer{
	private String student="I am doing the roles of the Student";
	public void doStudentRoles(){
		System.out.println(student);
	}
}
class Friend extends Student{
	private String friend="I am doing the roles of the Friend";
	public void doFriendRoles(){
		System.out.println(friend);
	}
}
class Son extends Friend{
	private String son="I am doing the roles of the Son";
	public void doSonRoles(){
		System.out.println(son);
	}
}
class Human extends Son{
	private String human ="I am doing the roles of the Human";
	public void doHumanRoles(){
		System.out.println(human);
	}
	public static void main(String[] args){
		Human 		h1 	= new Human();
		Son  		s1	=	h1;
		Friend  	f1 	= 	h1;
		Student 	s2	=	h1;
		Employer	e1	=	h1;
		Husband 	h2  =	h1;
		Father  	f2	=	h1;
		GrandFather g1	=	h1;
		h1.doHumanRoles();
		s2.doStudentRoles();
		g1.doGrandFatherRoles();
	}
}
