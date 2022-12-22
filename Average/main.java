import java.util.*;
class main
{
	public static void main(String args[])
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		int i,j,sum=0;
		System.out.println("Enter the array:");
		for(i=0;i<n;i++)
		{	
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];		
		}
		double avg=(double)sum/n;
		System.out.println("Average="+avg);
	}
}



