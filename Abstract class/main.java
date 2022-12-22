import java.util.*;
abstract class shape
{
	abstract void area();
}

class circle extends shape
{
	int r;
	double area;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of the Cirle");
		r=sc.nextInt();
	}

	public void area()
	{
		area=3.14*r*r;
		System.out.println("Area of Circle:"+area);
	}
}

class rectangle extends shape
{
	int l,b;
	double area;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length and Breadth of Rectangle");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	public void area()
	{
		area=l*b;
		System.out.println("Area of Rectangle:"+area);
	}
}

class triangle extends shape
{
	int b,h;
	double area;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base and Height of Triangle");
		b=sc.nextInt();
		h=sc.nextInt();
	}
	public void area()
	{
		area=0.5*b*h;
		System.out.println("Area of Triangle:"+area);
	}
}

class main
{
	public static void main(String args[])
	{
		circle c=new circle();
		c.accept();
		c.area();
		rectangle r=new rectangle();
		r.accept();
		r.area();
		triangle t=new triangle();
		t.accept();
		t.area();

	}
}

