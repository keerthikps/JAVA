import java.util.*;
public class Chocolate
{
   public static void main(String[] args)
  {
     int N,t;
    Scanner sc=new Scanner(System.in);
    t=sc.nextInt();
    while(--t>=0)
      {
        N=sc.nextInt();
        if(N % 2 == 0)
          System.out.println("YES");
        else
           System.out.println("NO");
      }
  }
}