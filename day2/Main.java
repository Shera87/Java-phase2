package day2;

import java.util.Scanner;

public class Main {
	public static void positiveformat(int a){
		if(a < 0){
			a = a * (-1);
		}
		System.out.println(a);
	}
	public static void larg(int a,int b){
		if(a > b)
			System.out.println(a);
		else
			System.out.println(b);
	}
	public static String posneg(int a){
		if(a >= 0)
			return "Pos";
		else
			return "neg";
	}
	public static String twodig(int b){
		if(( b >= -99 && b <= -10)|| (b >= 10 && b <= 99)){
			return "two digit no";
		}
		else{
			return "not two digit no";
		}
	}            
	public static String equal(int a, int b){
		if(a == b)
			return "equal";
		else
			return "not equal";
	}
	public static String zero(int a){
		if(a == 0)
			return "no is zero";
		else
			return "no is not zero";
	}
	public static void evenodd(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
	} 
	public static void terevenodd(int a){
		System.out.println(a % 2 == 0 ?"even":"odd");
	}
	public static void vote(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name:");
		String name = sc.nextLine();
		System.out.println("enter age:");
		int age = sc.nextInt();
		if(age >= 18)
			System.out.println("eligible to vote");
		else
			System.out.println("not eligible to vote");
	}
	public static void date() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter date,month,year");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		if (y < 1999 || y > 2027) {
            System.out.println("Invalid year");
        }
		else if(m>12) {
			System.out.println("invalid month");
		}
		else {
			if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
				if(d>=1 && d<=31) {
					System.out.println("date valid");
				}
				else {
					System.out.println("date invalid");
				}
			}
			else if(m==4 || m== 6 || m== 9 || m==11){
				if(d>=1 && d<=30) {
					System.out.println("date valid");
				}
				else {
					System.out.println("date invalid");
				}
			}
			else {
				if(y%400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
					if(d>=1 && d<=29) {
						System.out.println("date valid");
					}
					else {
						System.out.println("date invalid");
					}
				}
				else
				{
					if(d>=1 && d<=28) {
						System.out.println("date valid");
					}
					else {
						System.out.println("date invalid");
					}
				}
			}
		}
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		positiveformat(a);
		larg(a,b);
		System.out.println(posneg(a));
		System.out.println(twodig(b));
		System.out.println(equal(a,b));
		System.out.println(zero(a));
		evenodd();
		terevenodd(a);
		vote();
		date();
	}
}
