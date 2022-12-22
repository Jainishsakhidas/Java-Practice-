import java.util.*;
class distance
{
	int ft,in;
	distance()
	{
		ft=in=0;
	}
	distance(int x,int y)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Feet and Inches:");
		ft=sc.nextInt();
		in=sc.nextInt();
	}
	void add(distance d1,distance d2)
	{
		in=d1.in+d2.in;
		ft=in/12;
		in=in%12;
		ft=ft+d1.ft+d2.ft;
	}
	void display()
	{
		System.out.println("Feet="+ft+" Inches="+in);
	}
}
class main
{
	public static void main(String args[])
	{
		
		distance d1=new distance(0,0);
		System.out.print("D1:");
		d1.display();
		distance d2=new distance(0,0);
		System.out.print("D2:");
		d2.display();
		distance d3=new distance();
		d3.add(d1,d2);
		System.out.print("D3(Addition of D1 and D2):");
		d3.display();
	}
}