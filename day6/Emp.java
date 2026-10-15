package day6;
abstract class Employee{
	public abstract void Salary();
	public void Dept(){
		System.out.println("Accounting");
	}
}
class A extends Employee{
	public void Salary(){
		System.out.println("Total Salary: 15000");
	}
}
public class Emp {
	public static void main(String[]args){
		A obj = new A();
		obj.Salary();
		obj.Dept();
	}
}
