package day5;

import java.util.Scanner;
public class Nosymbol {
	public static void main(String[]args){
		String name = "Shera@078";
		String result =" ";
		for(int i =0;i < name.length();i++){
			char ch = name.charAt(i);
			if((ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')){
				result = result + ch;
			}
		}
		System.out.println(result);
	}
}
