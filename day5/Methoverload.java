package day5;

public class Methoverload {
	public static void add(int a){
		System.out.println(a);
	}
	public static void add(int a,int b){
		System.out.println(a + b);
	}
	public static void add(float a){
		System.out.println(a);
	}
	public static void main(String[]args){
		add(4);
		add(7,8);
		add(8.7f); 
	}
}
