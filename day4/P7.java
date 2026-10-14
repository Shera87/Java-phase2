package day4;

import java.util.Scanner;

public class P7 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long arr [] = new Long[n];
		for(int i = 0; i < arr.length;i++){
			arr[i] = sc.nextLong();
		}
		for(int i = 0; i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
