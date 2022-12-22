import java.util.*;
class complex
{
	double x,y;
	complex()
	{
		x=0;
		y=0;		
	}
	complex(double a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Real part=Imganiary part of the complex no:");
		x=sc.nextInt();
		y=x;
	}
	complex(double a,double b)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Real part and Imganiary part of the complex no:");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	void add(complex a,complex b)
	{
		x=a.x+b.x;
		y=a.y+b.y;
	}
	void display()
	{
		System.out.println(x+" + "+y+"i");
	}
}

class main
{
	public static void main(String args[])
	{
		complex c1=new complex(0,0);
		System.out.print("C1:");
		c1.display();
		complex c2=new complex(0);
		System.out.print("C2:");
		c2.display();
		complex c3=new complex();
		c3.add(c1,c2);
		System.out.println("C3:Addition of two complex number C1 and C2:");
		c3.display();
		c1.add(c1,c2);
		System.out.println("C1:Addition of two complex number C1 and C2:");
		c1.display();
	}
}