package abstarctassignment;

public abstract class A_Employee {
	
	String name;
	int paymentPerHour;
	
	public A_Employee(String name,int paymentPerHour)
	{
		this.name=name;
		this.paymentPerHour=paymentPerHour;
	}
	
	public abstract int calculateSalary();

}