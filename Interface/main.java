import java.util.*;
class student
{
	int rollno;
	String name;

	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Roll no and Name of the student");
		rollno=sc.nextInt();
		name=sc.next();
	}
	public void display()
	{
		System.out.println("\nRoll no:"+rollno+"\nName:"+name);
	}
}

class test extends student
{
	String subject1,subject2;
	public void accept()
	{
		super.accept();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Subject 1 and Subject 2");
		subject1=sc.next();
		subject2=sc.next();
	}

	public void display()
	{
		super.display();
		System.out.println("\nSubject 1:"+subject1+"\nSubject 2:"+subject2);
	}
}

interface marksheetInterface
{
	String collegeName="SAKEC";
	public void calculateMarksheet();
}

class marksheet extends test implements marksheetInterface
{
	double marks1,marks2;
	public void calculateMarksheet()
	{
		super.accept();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter marks for Subject 1 and Subject 2");
		marks1=sc.nextDouble();
		marks2=sc.nextDouble();
	}
	public void displayMarksheet()
	{
		super.display();
		System.out.println("\nCollege:"+collegeName+"\n"+subject1+" marks:"+marks1+"\n"+subject2+" marks:"+marks2);
	}
}

class main
{
	public static void main(String args[])
	{
		marksheet m=new marksheet();
		m.calculateMarksheet();
		m.displayMarksheet();
	}
}