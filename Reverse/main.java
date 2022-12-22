import java.util.*;
class main
{
	public static void main(String args[])
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		int[]b=new int[n];
		int i,j;
		System.out.println("Enter the array:");
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=0,j=n-1;i<n;i++,j--)
		{
			b[j]=a[i];
		}
		System.out.println("Reversed Array:");
		for(i=0;i<n;i++)
		{	
			System.out.println(b[i]);
		}
	}
}



