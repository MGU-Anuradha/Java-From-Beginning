 class A {
    private void m1(int a){

    }
}
class B extends A{
    public void m1(int a){

    }
}
//Compilation is okay. 

/* Method overriding is not implemented.
 * because private methods do not inherit. In this case m1()
 * method of class B is it's own method. Not the one of class A.
*/
