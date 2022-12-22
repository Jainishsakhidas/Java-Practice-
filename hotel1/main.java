import java.util.*;
class hotel
{
	double roomcharge;
	String name,address;
	int no_of_rooms;

	void accept()
	{
		System.out.println("Enter Hotel Name,Address,No of rooms and Room Charge");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		address=sc.next();
		no_of_rooms=sc.nextInt();		
		roomcharge=sc.nextDouble();
	}
	void display()
	{
		System.out.println("Hotel Name:"+name+"\tAddress:"+address+"\tNo of Rooms:"+no_of_rooms+"\tRoom charge:"+roomcharge);
	}
}
class main
{
	public static void main(String args[])
	{
		int n,i,j;
		System.out.print("Enter value of n:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		hotel h[]=new hotel[n];
		hotel temp=new hotel();
		for(i=0;i<n;i++)
		{
			h[i]=new hotel();
			h[i].accept();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(h[i].roomcharge>h[j].roomcharge)
				{
					temp=h[i];
					h[i]=h[j];
					h[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			h[i].display();
		}
	}
}