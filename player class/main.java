import java.util.*;
class Player
{

 String name;
 String team;
 float ba;
 Player()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter player name");
 name=sc.next();
 System.out.println("Enter team name");
 team=sc.next();
 System.out.println("enter batting average");
 ba=sc.nextFloat();
 }
 void disp()
 {
 System.out.println("Player name: "+name+" Team name: "+team+" Batting average: "+ba);
 }
}
class main
{
 public static void main(String args[])
 {
 int i,j,n;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of players");
 n=sc.nextInt();
 Player temp;
 Player p[]= new Player[n];
 for(i=0;i<n;i++)
 {
 p[i]= new Player();
 }
 for(i=0;i<n;i++)
 {
 for(j=i+1;j<n;j++)
 {
 if(p[i].ba<p[j].ba)
 {
 temp=p[i]; 
 p[i]=p[j];
 p[j]=temp;
 }
 }
 }
 for(i=0;i<n;i++)
 {
 p[i].disp();
 }
 }
} 