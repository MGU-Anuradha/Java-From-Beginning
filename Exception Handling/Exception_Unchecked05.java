public class Exception_Unchecked05{
    //static A a1; -->Exception occurs
    static A a1 = new A();
    public static void main(String[] args) {
        System.out.println("This line was executed-01");
        
        try {
            a1.setNo(100);
        } catch (NullPointerException np) {
            // TODO: handle exception
            System.out.println("ERROR : "+np.toString());

        }
        try {
            System.out.println("no = "+a1.getNo());
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("ERROR: "+e.toString());
        }
        
        System.out.println("This line was also executed-02");
    }
}

class A{
    private int no;
    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }
}