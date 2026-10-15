package p1;

public class B {
    public static void main(String[] args) {
        A obj = new A();

        // obj.privateMethod();   
        obj.defaultMethod();     
        obj.protectedMethod();   
        obj.publicMethod();       
    }
}