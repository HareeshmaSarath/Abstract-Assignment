package abstarctassignment;

public class A_FullTimeEmployee extends A_Employee{
	
	int workingHours=8;
	
	public A_FullTimeEmployee(String name, int paymentPerHour) 
	{
		super(name, paymentPerHour);
	}
	
	public int calculateSalary() 
	{
		return paymentPerHour*workingHours;
	}
	
	public static void main(String arg[])
	{
		A_FullTimeEmployee ob=new A_FullTimeEmployee("chinnu", 200);
		System.out.println("Salary of Fulltime Employee:"+ob.calculateSalary());
		A_Contractor ob1=new A_Contractor("minnu", 200, 4);
		System.out.println("Salary of Contractor:"+ob1.calculateSalary());
	}
	
}