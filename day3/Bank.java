package day3;

public class Bank {
	String cus_name;
	long phone;
	long acnt_no;
	double curnt_bal;
	double prev_bal;
	void display(){
		System.out.println("Customer Name: " + cus_name);
		System.out.println("Phone No: " + phone);
		System.out.println("Account No: " + acnt_no);
		System.out.println("Current Bal: " + curnt_bal);
		System.out.println("Previous Bal: " + prev_bal);
	}
	void state(){
		if(curnt_bal > prev_bal){
			System.out.println("Amount Credited ");
		}
		else{
			System.out.println("Amount Debited ");
		}
	}
	void amtcrd(){
		if(curnt_bal > prev_bal){
			double credit = curnt_bal - prev_bal;
			System.out.println("Credited amount is: " + credit);
		}
		else{
			System.out.println("Credited amount is: 0");
		}
	}
	void amtdeb(){
		if(curnt_bal < prev_bal){
			double debit = prev_bal - curnt_bal;
			System.out.println("Debited amount is: " + debit);
		}
		else{
			System.out.println("Debited amount is: 0");
		}
	}
	{
		System.out.println("---------------------------");
	}
	public static void main(String[]args){
		Bank c1 = new Bank();
		c1.cus_name = "Shiva";
		c1.phone = 9876540213l;
		c1.acnt_no = 879612535781l;
		c1.curnt_bal = 80000.00;
		c1.prev_bal = 50000.00;
		c1.display();
		c1.state();
		c1.amtcrd();
		c1.amtdeb();
		Bank c2 = new Bank();
		c2.cus_name = "Kumar";
		c2.phone = 8976540213l;
		c2.acnt_no = 567834524917l;
		c2.curnt_bal = 8000.00;
		c2.prev_bal = 30000.00;
		c2.display();
		c2.state();
		c2.amtcrd();
		c2.amtdeb();
		Bank c3 = new Bank();
		c3.cus_name = "Aakash";
		c3.phone = 9876589653l;
		c3.acnt_no = 467823987914l;
		c3.curnt_bal = 100000.00;
		c3.prev_bal = 60000.00;
		c3.display();
		c3.state();
		c3.amtcrd();
		c3.amtdeb();
	}
}
