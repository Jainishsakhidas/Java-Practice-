import java.util.*;
class practical1
{
	static boolean isprime(int n)
	{
		int c=0,i;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)	
				c++;	
		}
		if(c==2)
			return true;
		else
			return false;
	}
	static int count_of_digits(int n)
	{
		int c=0;
		while(n>0)
		{
			n=n/10;
			c++;		
		}
		return c;
	}
	public static void main(String args[ ])
	{
		Scanner sc=new Scanner(System.in);
		int n,n1,n2,i,count=0,j,k=0,smallest=0,largest=0;
		int[] prime_list1=new int[25];
		
		//accepting n1 & n2 from user

		do{
			System.out.println("Enter n1");
			n1=sc.nextInt();
			System.out.println("Enter n2");
			n2=sc.nextInt();
			if(n2<n1)
				System.out.println("n2 should be greater than n1");
			if(n1 < 2) 

            
				System.out.println("The first number should be greater or equal to 2"); 

        
			if(n2 > 100) 

            
				System.out.println("The second number should be less or equal to 100"); 

         
			if(n2 - n1 < 35) 

            
				System.out.println("The Difference of the two numbers should be greater than or equal to 35"); 

        	
		}while(n1 < 2 || n2 > 100 || n2 - n1 < 35||n2 < n1); 



		//Creating 1st prime list

		for(n=n1,i=0;n<=n2;n++)
		{
			boolean x=isprime(n);
			if(x)
			{
				count++;
				//System.out.println(n);
				prime_list1[i]=n;
				i++;
				if(count==1)
					smallest=n;	
				else
					largest=n;
					
			}
					
		}

		//printing 1st prime list

 		System.out.println("First  list:");
		for(i=0;i<count;i++)
		{
			//if(prime_list1[i]==0)
			//	continue;
			System.out.print(prime_list1[i]+"\t");
		}

		System.out.println("Smallest in first prime list="+smallest);
		System.out.println("Largest in first prime list="+largest);	
		System.out.println("Count of prime numbers in list1:"+count);
		
		//Creating combination of prime numbers in list 1 

		System.out.println("\nCombination of all prime numbers:");

		int[] combination=new int[count*count];
		int count2=0;
		for(i=0,k=0;i<count;i++)
		{
			if(prime_list1[i]!=0)
			{
			for(j=0;j<count;j++)
			{
				if(prime_list1[i]==prime_list1[j])
					continue;
				int b=count_of_digits(prime_list1[j]);
				
				combination[k]=prime_list1[i]*(int)Math.pow(10,b)+prime_list1[j];
				k++;
				count2++;
			}
			}
		}

		//printing combination of prime numbers in list 1

		for(i=0;i<count2;i++)
		{
			System.out.print(combination[i]+"\t");
		}
		
		System.out.println("\nSecond prime list:");
		int count1=0,smallest1=0,largest1=0;
		for(i=0;i<combination.length;i++)
		{	if(combination[i]!=0)
			{
			boolean y=isprime(combination[i]);
			if(y)
			{
				System.out.print(combination[i]+"\t");
				count1++;
				if(count1==1)
					smallest1=combination[i];	
				else
					largest1=combination[i];
			}		
			}	
		}

		System.out.println("\nSmallest in first prime list="+smallest1);
		System.out.println("Largest in first prime list="+largest1);	
		System.out.println("Count of prime numbers in list1:"+count1);
		

		long f=smallest1,s=largest1,t=0;
		System.out.println("\nFibonacci series till "+count1+"th term");
		for(i=1;i<=count1;i++)
		{
			if(i==1)
			{	
				System.out.println(f);
			}
			else if(i==2)
			{
				System.out.println(s);
			}	
			else
			{		
				t=f+s;
				System.out.println(t);
				f=s;
				s=t;
			}
		}
		System.out.println("Last term of fibo series:"+t);
	}
}