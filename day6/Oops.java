package day6;

abstract class Ak{
	public abstract void hello();
}
class Mk extends Ak{
	public void hello(){
		System.out.println("hello");
	}
}
public class Oops {
	public static void main(String[]args){
		Mk a = new Mk();
		a.hello();
	}
}
