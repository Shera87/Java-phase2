package day5;
class Details{
	private int id = 102;
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
}
public class EncA {
	public static void main(String[]args){
		Details d = new Details();
		System.out.println("ID = " +d.getId());
		d.setId(100);
		System.out.println("ID = " +d.getId());
	}
}
