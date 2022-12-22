import java.util.Scanner;
class NumToWords
{
	static int length(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;		
	}
	static void num_to_words(int n,int count)
	{
		int m;
		while(count>0)
		{
			m=n/(int)Math.pow(10,count-1);
			if(m>9)
			{
				m=m%10;
			}
			switch(m)
			{
			case 0:System.out.print("Zero ");break;
			case 1:System.out.print("One ");break;
			case 2:System.out.print("Two ");break;
			case 3:System.out.print("Three ");break;
			case 4:System.out.print("Four ");break;
			case 5:System.out.print("Five ");break;
			case 6:System.out.print("Six ");break;
			case 7:System.out.print("Seven ");break;
			case 8:System.out.print("Eight ");break;
			case 9:System.out.print("Nine ");break;
			}
			count--;
		}

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,count;
		System.out.println("Enter a number to convert it in words:");
		n=sc.nextInt();
		count=length(n);
		num_to_words(n,count);
	}	
}			