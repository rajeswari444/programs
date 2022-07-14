import java.util.*;
class fib
  {
    public static void main(String args[])
    {
      int a=0,b=1;
      Scanner s=new Scanner(System.in);
    System.out.println("enter n value");
         int n=s.nextInt();
      for (int i = 1; i <= n; ++i) {
      System.out.print(a + ", ");

      // compute the next term
      int c=a + b;
      a = b;
      b = c;
      
    }
  }
  }