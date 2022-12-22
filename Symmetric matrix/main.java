import java.util.Scanner;
import java.io.*;
class main1
{
  public static void main(String args[]) throws Exception
  {
    int i,j,r,c,flag=0;
    //Scanner sc = new Scanner(System.in);
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.println("Enter total number of rows:");
    //r = sc.nextInt();
    r =Integer.parseInt(br.readLine());
    System.out.println("Enter total number of column:");
    //c = sc.nextInt();
    c =Integer.parseInt(br.readLine());
    int a[][]= new int[r][c];  
    if(c!=r)
    {
      System.out.println("Rows and column must be equal");
    }
    else
    {
      System.out.println("Enter the matrix");
      for (i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
        {
          //a[i][j]=sc.nextInt(); 
          a[i][j]=Integer.parseInt(br.readLine());    
        }
      }
      for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
        {
          if(a[i][j]!=a[j][i])
          {
            flag=1;
            break;
          }     
        }
      }
      if(flag==1)
      {
        System.out.println("Matrix is Not Symmetric");
      }
      else
      {
        System.out.println("Matrix is Symmetric"); 
      }
    }
  }
}