import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	  Scanner in= new Scanner (System.in);
      int n1= in.nextInt();
      int n2=n1%100;
      int n3=n2%10;
      int n4=n1/100;
     
      int sum= n3+n4;
      System.out.println(sum);
	
	}
}