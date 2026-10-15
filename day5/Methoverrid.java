package day5;
/*class Allean{
	public void party(){
		System.out.println("Home");
	}
}
class Smith extends Allean{
	public void party(){
		System.out.println("Beach");
	}
}
public class Methoverrid {
	public static void main(String[]args){
		Allean obj = new Allean();
	    obj.party();
	    obj = new Smith();
	    obj.party(); 
	}
}*/

class Shera{
	void dream(){
		System.out.println("Data Analyst");
	}
}
class Dad extends Shera{
	void dream(){
		System.out.println("It job in abroad");
	}
}
public class Methoverrid{
	public static void main(String[]args){
		Shera s = new Dad();
		s.dream();
	}
}
	
