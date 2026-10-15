package day6;

import java.util.Scanner;
public class ZohoQ {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		while(a <= 'Z'){
			System.out.print(a++ + " ");
		}
	}
}
