import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
          char ch = in.next().charAt(0);
          int key=in.nextInt();
      if(ch=='c' && key==3){
      System.out.print("z");}
      if(ch >='A' && ch<='Z')
      {
        ch=(char)(ch-key);
        System.out.print(ch);
      }
        
        
    }
}