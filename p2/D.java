package p2;

import p1.A;

public class D extends A {
    public void display() {
        // privateMethod();      
        // defaultMethod();      
        protectedMethod();       
        publicMethod();          
    }

    public static void main(String[] args) {
        D obj = new D();
        obj.display();
    }
}