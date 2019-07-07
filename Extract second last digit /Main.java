import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    	  Scanner in= new Scanner (System.in);
      int n1= in.nextInt();
      int n2=n1%10000;
      int n3=n2%1000;
      int n4=n3%100;
      int n5=n4/10;
      
      System.out.println(n5);
	}
	
	
}