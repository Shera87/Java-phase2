package day6;

abstract class Mark{
	public abstract void SubMark();
	public void sub(){
		System.out.println("Mathematics");
	}
}
class TotalMrk extends Mark{
	public void SubMark(){
		System.out.println("Total Mark: 150");
	}
}
public class Stu {
	public static void main(String[]args){
		TotalMrk tm = new TotalMrk();
		tm.SubMark();
		tm.sub();
	}
}
