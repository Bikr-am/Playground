import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	     Scanner in = new Scanner(System.in);
        int n1= in.nextInt();
        int n2= in.nextInt();
        int n3= in.nextInt();
      int z;
      if(n1<n2)
      {
        if(n1<n3)
        {
           z=n1;
        }
        else{
           z=n3;}
      }
      else
      {
        if(n2<n3)
        {
           z=n2;
        }
        else
        {
           z=n3;
        }
      }
      int gcd=1;
     for(int i=1; i<=z ; i++)
     {
       if(n1%i==0 && n2%i==0 && n3%i==0)
       {
         gcd=i;
       }  
     }
        System.out.print(gcd);
      if(gcd==1)
      {
         
        System.out.print(gcd);
      }
        
      
          
      
	}
}