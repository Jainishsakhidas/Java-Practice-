import java.util.*;
class number
{
	int x,y,z;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x,y,z");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
	}
	void add(number n1,number n2,number n3)
	{
		x=n1.x+n2.x+n3.x;
		y=n1.y+n2.y+n3.y;
		z=n1.z+n2.z+n3.z;
		System.out.println("Addition:\nx:"+x+" y:"+y+" z:"+z);
	}
}
class main
{
	public static void main(String args[])
	{
		number n1=new number();
		number n2=new number();
		number n3=new number(); 
		number n4=new number();
		n1.accept();
		n2.accept();
		n3.accept();
		n4.add(n1,n2,n3);
	}
}