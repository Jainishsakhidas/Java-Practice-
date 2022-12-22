import java.util.*;
class customer
{
	int cust_no;
	float bank_balance;
	String name;;
	customer()
	{
		System.out.println("Enter Customer No,Customer name,bank balance");
		Scanner sc=new Scanner(System.in);
		cust_no=sc.nextInt();
		name=sc.next();		
		bank_balance=sc.nextFloat();
		
	}
	void display()
	{
		System.out.println("Customer No:"+cust_no);
		System.out.println("Customer Name:"+name);
		System.out.println("Customer Bank Balance:"+bank_balance);
	}
}
class main
{	
	public static void main(String args[])
	{
		int i,j;
		customer c[]= new customer[5];
		for(i=0;i<=4;i++)
		{
			c[i]= new customer();
		}
		customer temp;
		for(i=0;i<=3;i++)
		{
			for(j=i+1;j<=4;j++)
			{
				if(c[i].bank_balance<c[j].bank_balance)
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=c[i];
				}
			}	
		}
	System.out.println("Customer with max balance is");
	c[0].display();
	}
}

		