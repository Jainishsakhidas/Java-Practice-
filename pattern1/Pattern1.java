import java.util.Scanner;
class pattern1
{
	public static void main(String args[])
	{
		int i,j,k,n,space;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		space=n-1;
		System.out.println("The pattern is :");
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			space--;
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
				
			}
			System.out.print("\n");
		}

	}
}