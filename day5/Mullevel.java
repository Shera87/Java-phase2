package day5;
class Grandfather{
	String gold = "15grms";
	void land(){
		System.out.println("Land");
	}
}
class Father1 extends Grandfather{
	String vehicle = "BMW";
	void work(){
		System.out.println("Working");
	}
}
class Son1 extends Father1{
	void play(){
		System.out.println("Playing");
	}
}
public class Mullevel {
	public static void main(String[]args){
		Son1 sn = new Son1();
		sn.land();
		sn.work();
		sn.play();
		System.out.println(sn.gold);
		System.out.println(sn.vehicle );
	}
}
