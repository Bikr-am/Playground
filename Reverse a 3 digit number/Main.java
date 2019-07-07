import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in= new Scanner (System.in);
    int num = in.nextInt();
    int n1= num%10;
    int n2= num%100;
    int n3= n2/10;
    int n4=num/100;
    int reno= (n1*100 + n3*10 + n4*1);
    System.out.println(reno);
  }
}