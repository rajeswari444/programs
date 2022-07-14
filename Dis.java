import java.util.*;
class Dis
  {
    public static void main(String args[])
    {
      int sum=0;
      Scanner s=new Scanner(System.in);
      System.out.println("enter array size:");
     int n=s.nextInt();
      int a[]=new int[n];
      System.out.println("enter array elements:");
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      for(int i=0;i<n;i++)
        sum=sum+a[i];
        System.out.println(sum);
  
      
  }
}