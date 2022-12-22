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

    public static void main(String args[ ]) 

    { 

        Scanner sc=new Scanner(System.in); 

        int n,n1,n2,i,count=0,smallest=0,largest=0; 

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

  

             

        }while(n1 < 2 &&n2 > 100 && n2 - n1 < 35&&n2 < n1);  

  

  

  

        System.out.println("Prime nos from range n1 to n2 are:"); 

        for(n=n1;n<=n2;n++) 

        { 

            boolean x=isprime(n); 

            if(x==true) 

            { 

                count++; 

                System.out.println(n); 

                if(count==1) 

                    smallest=n;     

                else 

                    largest=n; 

            } 

                     

        } 

        System.out.println("Smallest="+smallest); 

        System.out.println("Largest="+largest);     

        System.out.println("Count of prime numbers:"+count); 

  

  

        int f=smallest,s=largest,t=0; 

        System.out.println("Fibonacci series till "+count+"th term"); 

        for(i=1;i<=count;i++) 

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