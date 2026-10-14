package day4;

import java.util.Scanner;
public class Twod {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		int b [][] = {{1,2},{3,4}};
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[0].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i =0; i<arr.length;i++){
			for(int j = 0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
