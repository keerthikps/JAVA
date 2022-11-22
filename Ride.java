import java.util.*;
public class Ride
{
   public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
      int t;
      int X,H;
      t=sc.nextInt();
      while(--t>=0)
        {
           X=sc.nextInt();
           H=sc.nextInt();
           if(X>=H)
             System.out.println("YES");
          else
             System.out.println("NO");
        }
    
  }
}