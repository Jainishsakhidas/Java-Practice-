import java.util.*;
class book
{
	int quantity;
	double price;
	String title,author;
	void accept()
	{
		System.out.println("Enter Title of the book,Author Name,Price and Quantity ");
		Scanner sc=new Scanner(System.in);
		title=sc.next();
		author=sc.next();
		price=sc.nextDouble();
		quantity=sc.nextInt();
	}
	void display()
	{
		System.out.println("Title:"+title+"\tAuthor:"+author+"\tPrice:"+price+"\tQuantity:"+quantity);
	}
}
class main
{
	public static void main(String args[])
	{
		int n,i,j,x;
		System.out.print("Enter value of n:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		book b[]=new book[n];
		book temp=new book();
		for(i=0;i<n;i++)
		{
			b[i]=new book();
			b[i].accept();
		}
		System.out.println("Enter price:");
		x=sc.nextInt();
		System.out.println("List of book whose price is greater than the given price:");
		for(i=0;i<n;i++)
		{
			if(b[i].price>x)
			{
				b[i].display();
			}
		}
	}
}