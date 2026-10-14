package day3;

public class Lap {
	String bn;
	String c;
	int sno;
	double p;
	Lap(String c,int sno){
		this.c= c;
		this.sno = sno;   
	}
	Lap(String bn,String c,int sno,double p){
		this.c = bn;
		this.c = c;
		this.sno = sno;
		this.p = p;
	}
	Lap(String bn, double p){
		this.bn = bn;
		this.p = p;
	}
	{
		System.out.println("--------------------");
	}
	public static void main(String[]args){
		Lap obj1 = new Lap("Axus","Burgundy",532,50000);
		System.out.println(obj1.bn);
		System.out.println(obj1.c);
		System.out.println(obj1.sno);
		System.out.println(obj1.p);
		Lap obj2 = new Lap ("Mac Book","White",102,200000);
		System.out.println(obj2.bn);
		System.out.println(obj2.c);
		System.out.println(obj2.sno + obj2.c);
		System.out.println(obj2.p);

	}
}
