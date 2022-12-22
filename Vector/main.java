import java.util.*;
class main
{
  public static void main(String args[])
  {
    Vector v=new Vector();
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      System.out.println("1.Add\n2.Delete\n3.Search\n4.Display\n5.Exit\nEnter choice");
      int ch=sc.nextInt();
      if(ch==5)
        break;
      switch(ch)
      {
        case 1:{
          System.out.println("Enter the name of item:");
          String s=sc.next();
          v.addElement(s);
          System.out.println("Item inserted");
        }break;

        case 2:{
          System.out.println("Enter the name of Item to be deleted");
          String s1=sc.next();
          if(v.contains(s1))
          {
            v.removeElement(s1);
            System.out.println("Item Deleted");
          }
          else
          {
            System.out.println("Item Not Found");
          }
        }break;

        case 3:{
          System.out.println("Enter the name of item to be searched");
          String s2=sc.next();
          if(v.contains(s2))
          {
           int x=v.indexOf(s2);
           System.out.println("Item found at index "+x);
          }
          else
          {
            System.out.println("Item Not Found");
          }
        }break;

        case 4:{
          for(int i=0;i<v.size();i++)
          {
            System.out.println(v.elementAt(i));
          }
        }break;

        default:
        {
          System.out.println("Invalid Choice");
        }
      }
    }
  }
}