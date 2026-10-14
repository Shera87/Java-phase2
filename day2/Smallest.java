package day2;

public class Smallest {
	public static void small(int a,int b,int c){
		if(a<=b && a<=c){
			System.out.println(a);
		}
		else if(b<=a && b<=c){
			System.out.println(b);
		}
		else{
			System.out.println(c);
		}
	}
	public static void main(String[]args){
		small(34,66,29);
	}
}
