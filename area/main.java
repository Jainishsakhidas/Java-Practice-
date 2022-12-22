class shape
{
	double area;
	void area(double r)
	{
		area=3.14*r*r;
		System.out.println("Area of Circle="+area);
	}
	void area(int l,int b)
	{
		area=l*b;
		System.out.println("Area of Rectangle="+area);
	}
	void area(int a)
	{
		area=a*a;
		System.out.println("Area of Square="+area);
	}
}
class main
{
	public static void main(String args[])
	{
		shape circle=new shape();
		shape square=new shape();
		shape rectangle=new shape();
		circle.area(3.0);
		square.area(2);
		rectangle.area(10,20);
	}
}