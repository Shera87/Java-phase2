package day5;

class Student{
	void name(){
		System.out.println("Shera");
	}
}
class Mark extends Student{
	void mark(){
		System.out.println("Maths: 97");
		System.out.println("English: 92");
		System.out.println("Phy: 77");
		System.out.println("CN: 85");
		System.out.println("CE: 79");
	}
}
class Result extends Mark{
	void res(){
		System.out.println("Total mark: 447");
	}
}
public class inher {
	public static void main(String[]args){
		Result obj1 = new Result();
		obj1.name();
		obj1.mark();
		obj1.res();
	}
}
