package day6;

abstract class AtmDisplay{
	public abstract void withdraw();
	public void Balance(){
		System.out.println("Balance");
	}
}
class Atm extends AtmDisplay{
	public void withdraw(){
		System.out.println("Withdraw amount");
	}
}
public class AtmDis {
	public static void main(String[]args){
		Atm a = new Atm();
		a.withdraw();
		a.Balance();
	}
}
