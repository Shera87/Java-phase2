package day2;

public class Factorial {
	public static int fact(){
		int n = 5;
		int f = 1;
		for(int i = 1; i <= n; i++){
			f = f * i;
		}
		return f;
	}
	public static void main(String[]args){
		int r = fact();
		System.out.println(r);
	}
}
