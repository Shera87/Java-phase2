package day2;

public class PrimeNo {
	public static String prime(int n){
		for(int i = 2; i < n; i++){
			if(n % i == 0){
				return "not a pr                                                                         ime no"; 
			}
		}
		return "prime no";
	}
	public static void main(String[]args){
		System.out.println(prime(34));
	}
}
