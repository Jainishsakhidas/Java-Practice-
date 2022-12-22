import java.util.Scanner;
class Employee
{
	int empId,salary,da,hra;
	float incometax;
	String empname;
	Employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		empId=sc.nextInt();
		System.out.println("Enter Employee Name:");
		empname=sc.next();
		System.out.println("Enter Employee salary:");
		salary=sc.nextInt();
		System.out.println("Enter DA:");
		da=sc.nextInt();
		System.out.println("Enter HRA:");
		hra=sc.nextInt();
		System.out.println("Enter Income tax:");
		incometax=sc.nextFloat();
	}
	void display()
	{
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empname);
		System.out.println("Salary: "+salary);
		System.out.println("DA: "+da);
		System.out.println("Hra: "+hra);
		System.out.println("Income tax: "+incometax);
	}
	float grossSal()
	{
		return (float)salary+da+hra-incometax;
	}
	
}
class demo
{
	public static void main(String args[])
	{
		float grossSal;
		Employee e1=new Employee();
		grossSal=e1.grossSal();
		e1.display();
		System.out.println("Gross Salary: "+grossSal);
	}
}