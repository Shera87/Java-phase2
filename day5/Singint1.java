package day5;

class Mother{
	void land(){
		System.out.println("The land belongs to daugh");
	}
	void jewels(){
		System.out.println("The jewel belongs to daugh");
	}
}
class Daugh extends Mother{
	void gift(){
		System.out.println("Gifting mother");
	}
}
public class Singint1 {
	public static void main(String[]args){
		Daugh d = new Daugh();
		d.land();
		d.jewels();
		d.gift();
	}
}
