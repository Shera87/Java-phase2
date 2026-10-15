package day6;

interface Bc{
	public abstract void a();
}
interface Cd{
	public abstract void b();
}
public class Inter implements Bc,Cd{
	public void a(){
		System.out.println("Hello");
	}
	public void b(){
		System.out.print("World");
	}
	public static void main(String[]args){
		Inter in = new Inter();
		in.a();
		in.b();
	}
}
