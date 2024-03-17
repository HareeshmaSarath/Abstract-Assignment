package abstarctassignment;

public class A_Contractor extends A_Employee{

	int workingHours;
	
	public A_Contractor(String name, int paymentPerHour,int workingHours) 
	{
		super(name, paymentPerHour);
		this.workingHours=workingHours;
	}
	
	public int calculateSalary() 
	{
		return paymentPerHour*workingHours;
		
	}
}