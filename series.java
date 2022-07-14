import java.util.*;
class series
  {
    public static void main(String args[])
    {
      int n;
      double sum=0;
      Scanner s=new Scanner(System.in);
      System.out.println("enter n value:");
      n=s.nextInt();
      for(int i=1;i<=n;i++)
      {
        sum=sum+1.0/i;
      }    
      System.out.println(sum);
    }
  }