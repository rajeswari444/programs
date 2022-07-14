import java.util.*;
public class max
  {
   public static void main(String args[]) {
     int x,y,z;
  Scanner sc=new Scanner(System.in);
     x=sc.nextInt();
     y=sc.nextInt();
     z=sc.nextInt();
      if (x > y && x > z)
         System.out.println( x + " is the maximum number.");
      else if (y > x && y >z)
         System.out.println( y + " is the maximum number.");
      else
         System.out.println( z + " is the maximum number.");
   }
}