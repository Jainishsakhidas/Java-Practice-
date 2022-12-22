import java.util.*;
import org.calculator.Arithmetic;
import org.calculator.CalcPower;
class demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			int x=0,a=0,b=0;
			System.out.println("Operations to Perform\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Square\n6.Cube\n7.Exit");
			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			if(choice==7)
					break;
			if (choice<=4)
			{	
				System.out.println("Enter two numbers=");
				a=sc.nextInt();
				b=sc.nextInt();
			}
			if (choice>4)
			{
				System.out.println("Enter a number=");
				a=sc.nextInt();
			}
			switch(choice)
			{
				case 1: x=Arithmetic.add(a,b);break;
				case 2: x=Arithmetic.subtract(a,b);break;
				case 3: x=Arithmetic.multiply(a,b);break;
				case 4: x=Arithmetic.divide(a,b);break;
				case 5: x=CalcPower.square(a);break;
				case 6: x=CalcPower.cube(a);break;	
			}
			System.out.println("Result="+x);
		}
	}
}
