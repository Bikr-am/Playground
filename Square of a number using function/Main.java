import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
     int n= in.nextInt();
     int result;
     result=square(n);
     System.out.print(result);
	} 
  public static int square(int x)
  {
    int z;
    z=x*x;
    return z;
  }
  
}