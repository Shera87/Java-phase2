package day6;

import java.util.Scanner;
public class ZohoQues {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch >= 'A' && ch <= 'Z'){
			for(char i = ch; i <= 'Z';i++){
				System.out.print(i + " ");
			}
		}
		else{
			for(char i = ch; i <= 'z';i++){
				System.out.print(i + " ");
		    }
		}
	}
}
