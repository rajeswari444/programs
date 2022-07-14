import java.util.*;
class sum1
  {
    public static void main(String args[])
    {
      int n,sum=0;
      Scanner s=new Scanner(System.in);
      System.out.println("enter n value");
      n=s.nextInt();
      int i=1;
      {
        while(i<=n)
          {
            
            sum=sum+i;
            i++;
          }
         System.out.println(sum);
      }
      
    }
  }