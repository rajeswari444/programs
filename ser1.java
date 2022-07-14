
import java.util.*;
public class ser1
  {
    public static void main(String args[])
    {
      
      int i, j; 
      int n,m;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter No of Rows");
      m=sc.nextInt(); 
      System.out.println("Enter No of Stars Required per a Row");
      n=sc.nextInt();

      System.out.println("-------Output--------");
        for(i=0;i<m;i++)
            {           
              System.out.print(" ");
             for(j=0; j<n; j++)
              {       
                System.out.print("* ");
               }           
             System.out.println();
            } 
    }
  }
