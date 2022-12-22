import java.util.*; 
class main
{ 
    public static void main(String args[]) 
    { 
        int i,j,flag=0; 
        String s; 
        Scanner sc=new Scanner(System.in); 
        s=sc.nextLine();
        char c[]=s.toCharArray(); 
        for(i=0;i<c.length;i++) 
        { 
           c[0]=Character.toUpperCase(c[0]);
           if(c[i]==' ')
           {
              c[i+1]=Character.toUpperCase(c[i+1]);
           }
        }   
        s=new String(c);
        System.out.println(s);
    }
}