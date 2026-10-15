package day5;

class Father{
	void work(){
		System.out.println("Working");
	}

}
class Son extends Father{
	void play(){
		System.out.println("Playing");
	}
}
public class SingInh {
	
	public static void main(String[]args){
		Son s = new Son();
		s.work();
	}
}
