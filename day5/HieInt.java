package day5;

class Father2{
	void work(){
		System.out.println("Working");
	}
}
class Son2 extends Father2{
	void play(){
		System.out.println("Playing");
	}
}
class Son3 extends Father2{
	void college(){
	   System.out.println("Going College");
	}
}
public class HieInt {
	public static void main(String[]args){
		Son2 sn1 = new Son2();
		Son3 sn2 = new Son3();
		sn1.work();
		sn2.work();
		sn1.play();
		sn2.college();
	}
}
