import java.util.*;
class series1
  {
    public static void main(String args[])
    {
        int i,j;
      Scanner s=new Scanner(System.in);
       System.out.println("enter number of rows:");
         i=s.nextInt();
      for(i=1;i<=5;i++)
      {
        for(j=1;j<=i;j++)
          {
            System.out.print(i);
          }
        System.out.println("  ");
          
      } 
    }
  }
