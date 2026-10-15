package p2;

import p1.A;

public class E {
    public static void main(String[] args) {
        A obj = new A();

        // obj.privateMethod();   
        // obj.defaultMethod();   
        // obj.protectedMethod(); 
        obj.publicMethod();       
    }
}