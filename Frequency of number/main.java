import java.util.*;
class main
{
	public static void main(String args[])
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		int i,j,count=0,x;
		System.out.println("Enter the array:");
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		System.out.print("Enter a number to count the frequency of that number:");
		x=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				count++;
			}
		}
		System.out.println("The number "+x+" appeared "+count+" times in the array");
				
	}
}



