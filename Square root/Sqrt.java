import java.util.*;
class sqrt
{
	public static void main(String args[])
	{	
		int a;
		double s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find square root of a number:");
		a=sc.nextInt();
		s=Math.sqrt(a);
		System.out.println("Square root of "+a+"is"+s);
	}
}	