
/*A programmer needs to create student class with following 
 * variables.
 * -student_name
 * -student_index
 * -student_contactNo
 * The programmer plans to apply data adbstract to the class. 
 * If you are the programmer how you do that.
 * You can write any method as required.
 */

public class Homework {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("ushani");
        System.out.println("Name    : "+stu.getName());

        stu.setIndex("SE/2019/049");
        System.out.println("Index   : "+stu.getIndex());

        stu.setContact("0773889025");
        System.out.println("Contact : "+stu.getContact());
    }
}

class Student{
    private String name;
    private String index;
    private String contact;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setIndex(String index){
        this.index = index;
    }
    public String getIndex(){
        return index;
    }

    public void setContact(String contact){
        this.contact = contact;
    }
    public String getContact(){
        return contact;
    }
}
