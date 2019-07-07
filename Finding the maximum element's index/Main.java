import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in= new Scanner(System.in);
    int n= in.nextInt();
    int list[]= new int[n];
    int max;
    int j;
    
    for(int i=0;i<n ;i++)
    {
      list[i]=in.nextInt();
  }
    max=list[0];
    max=list[1];
    if(list[0]>list[1])
    {
       max=list[0];
      j=0;
    }
    else{
      max=list[1];
       j=1; }
    for(int i=2;i<n;i++)
    {
      if(max<list[i])
      {
        max=list[i];
         j=i;
      }
    }
    System.out.print(j);
}
}