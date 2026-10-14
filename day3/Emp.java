package day3;

public class Emp {
	String name;
	int empid;
	double salary;
	long phone;
	double day_sal;
	int leave_count;
	void monthsal(double day_sal, int leave_count){
		double total_sal = (30 * day_sal) - (day_sal * leave_count);
		System.out.println("Tot_sal:" + total_sal);
	}
	void calc_bonus(){
		double bonus = salary * 0.10;
		System.out.println("Bonus:" + bonus);
	}
	void updsal(double newSalary) {
	    salary = newSalary;
	    System.out.println("Upd_sal: " + salary);

	}
	void display(){
		System.out.println("Employee: " + name);
		System.out.println("Phn No: " + phone);
		System.out.println("Emp_id: " + empid);
		System.out.println("Salary: " + salary);
	}
	{
		System.out.println("-------------");
	}
	public static void main(String[]args){
		Emp p1 = new Emp();
		p1.name = "Shera";
		p1.empid = 102;
		p1.salary = 450.56;
		p1.phone = 9876543219l;
		p1.day_sal = 150.00;
		p1.leave_count = 6;
		p1.monthsal(p1.day_sal,p1.leave_count);
		p1.calc_bonus();
		p1.updsal(500.00);
		p1.display();
		Emp p2 = new Emp();
		p2.name = "Muruga";
		p2.empid = 103;
		p2.salary = 350.56;
		p2.phone = 9876543919l;
		p2.day_sal = 250.00;
		p2.leave_count = 8;
		p2.monthsal(p2.day_sal,p2.leave_count);
		p2.calc_bonus();
		p2.updsal(450.00);
		p2.display();
	}
}
