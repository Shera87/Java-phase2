package p1;

public class C extends A {
    public void display() {
        // privateMethod();      
        defaultMethod();         
        protectedMethod();       
        publicMethod();          
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}