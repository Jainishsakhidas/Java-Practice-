import java.util.*;
class employee
{
	int no;
	
	String name;
	void accept_employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee No and Name:");
		no=sc.nextInt();
		
		name=sc.next();
	}

	void display_employee()
	{
		System.out.println("Employee No:"+no+" Name:"+name);
	} 

}

class fulltime extends employee
{
	double basic=0,hra=0,da=0;
	double sal=0;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee's Basic Salary,Hra and Da:");
		basic=sc.nextDouble();
		hra=sc.nextDouble();
		da=sc.nextDouble();
		sal=basic+hra+da;
	}

	void display()
	{
		System.out.println("Employee's Basic salary:"+basic+" Hra:"+hra+" Da:"+da+"Salary:"+sal);
	}

}

class parttime extends employee
{
	int working_hours=0,wage=0,sal=0;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee's working hours and wage:");
		working_hours=sc.nextInt();
		wage=sc.nextInt();
		sal=working_hours*wage;
	}

	void display()
	{
		System.out.println("Employee's Working hours:"+working_hours+" Wage:"+wage+"Salary:"+sal);
	}	
}

class main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Full time employee\n2.Part time employee\n3.Exit\nEnter choice");
			int ch=sc.nextInt();
			if(ch==3)
			{
				break;
			}
			switch(ch)
			{
				case 1:
				{
					fulltime e1=new fulltime();
					e1.accept_employee();
					e1.accept();
					e1.display_employee();
					e1.display();
				}break;

				case 2:
				{
					parttime e2=new parttime();
					e2.accept_employee();
					e2.accept();
					e2.display_employee();
					e2.display();
				}break;

				default:
				{
					System.out.println("Invalid choice");
				}

			}
		}
	}
}