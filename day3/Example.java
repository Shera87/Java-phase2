package day3;

public class Example {
	int a;
	String b;
	float c;
	Example(){}
	Example(int a){
		this.a = a;
	}
	Example(int a,String b){
		this.a = a;
		this.b = b;
	}
	Example(int a,String b,float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public static void main(String[]args){
		Example obj1 = new Example();
		Example obj2 = new Example(34);
		Example obj3 = new Example(78,"Shera");
		Example obj4 = new Example(87,"Madhan",90.5f);
		System.out.println(obj1.a);
		System.out.println(obj2.a + obj3.b);
		System.out.println(obj3.a + obj4.b + obj4.c);
		System.out.println(obj4.a);
		
	}
}
