import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
     int n= in.nextInt();
      int sum;
      sum=add(n);
      System.out.print(sum);
	}
  public static int add (int x ) 
  {
    int z=0;
    for(int i=1 ;i<=x ; i++)
    {
      z= z+i;
    }
    return z;
  }
}