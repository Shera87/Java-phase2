package p1;

public class A {
    private void privateMethod() {
        System.out.println("Private method");
    }
    void defaultMethod() {
        System.out.println("Default method");
    }
    protected void protectedMethod() {
        System.out.println("Protected method");
    }
    public void publicMethod() {
        System.out.println("Public method");
    }
    public void sameClass() {
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
    public static void main(String[]args){
    	A obj = new A();
    	obj.sameClass();
    }
}