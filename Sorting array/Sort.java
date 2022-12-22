import java.util.*;
class sort
{
	public static void main(String args[])
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		int i,j,t;
		System.out.println("Enter the array:");
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{	for(j=i+1;j<=n-1;j++)
			{
				if(a[i]>a[j])
				{
					t=a[j];
					a[j]=a[i];
					a[i]=t;	
				}
			}
		}
		System.out.println("Sorted Array:");
		for(i=0;i<n;i++)
		{	
			System.out.println(a[i]);
		}
		System.out.println("Largest Element:"+a[n-1]);
		System.out.println("Second Largest Element:"+a[n-2]);

				
	}
}



