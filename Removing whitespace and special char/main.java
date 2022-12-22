import java.util.*; 
class main
{ 
    static public void main(String args[]) 
    { 
        int i,j,flag=0; 
        String s; 
        Scanner sc=new Scanner(System.in); 
        s=sc.nextLine();
        char c[]=s.toCharArray(); 
        for(i=0;i<c.length;i++) 
        { 
           if(!Character.isLetter(c[i]) && !Character.isDigit(c[i]))
           {
              c[i]=' ';
           }
        }   
        s=new String(c);
        s=s.replaceAll(" ", "");
        System.out.println(s);
    }
}