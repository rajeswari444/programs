import java.util.*;
public class ser
  {
    public static void main(String args[])
    {
      
      int row, col; 
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number");
      n=sc.nextInt();

      System.out.println("-------Output--------");
        for(row=0;row<n;row++)
            {           
              System.out.print(" ");
             for(col=0; col<=row; col++)
              {       
                System.out.print("* ");
               }           
             System.out.println();
            } 
    }
  }