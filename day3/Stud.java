package day3;

public class Stud {
	String name;
	int age;
	int reg_no;
	float mrk1;
	float mrk2;
	float mrk3;
	float sem_fees;
	void display(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Reg_No: " + reg_no);
		System.out.println("Mark 1: " + mrk1);
		System.out.println("Mark 2: " + mrk2);
		System.out.println("Mark 3: " + mrk3);
	}
	void year(){
		int birth_year = 2006 - age;
		System.out.println("Birth_year:" + birth_year);
	}
	void tot_mrk(float mrk1, float mrk2, float mrk3){
		float total_mrk = mrk1 + mrk2 + mrk3;
		System.out.println("Total_Mark: " + total_mrk);
	}
	void tot_fees(){
		float total_fees = 8 * sem_fees;
		System.out.println("TotalFees: " + total_fees);
	}
	{
		System.out.println("----------------------");
	}
	public static void main(String[]args){
		Stud s1 = new Stud();
		s1.name = "Shera";
		s1.age = 20;
		s1.reg_no = 102;
		s1.mrk1 = 87.2f;
		s1.mrk2 = 78.7f;
		s1.mrk3 = 95.5f;
		s1.sem_fees = 7500.00f;
		s1.display();
		s1.year();
		s1.tot_mrk(s1.mrk1,s1.mrk2,s1.mrk3);
		s1.tot_fees();
		Stud s2= new Stud();
		s2.name = "Madhan";
		s2.age = 21;
		s2.reg_no = 64;
		s2.mrk1 = 77.2f;
		s2.mrk2 = 68.7f;
		s2.mrk3 = 85.5f;
		s2.sem_fees = 5500.00f;
		s2.display();
		s2.year();
		s2.tot_mrk(s2.mrk1,s2.mrk2,s2.mrk3);
		s2.tot_fees();
		Stud s3 = new Stud();
		s3.name = "Selva";
		s3.age = 19;
		s3.reg_no = 100;
		s3.mrk1 = 86.6f;
		s3.mrk2 = 75.3f;
		s3.mrk3 = 65.5f;
		s3.sem_fees = 3500.00f;
		s3.display();
		s3.year();
		s3.tot_mrk(s3.mrk1,s3.mrk2,s3.mrk3);
		s3.tot_fees();
	}
}
