import java.util.*;
class Copy
  {
    public static void main(String args[])
    {
         int x;
    Scanner s=new Scanner(System.in);
    System.out.println("enbter array size:");
    x=s.nextInt();
    int a[]=new int[x];
     int b[]=new int[x];
    System.out.println("enter values in an array");
         for(int c=0;c<x;c++)
                  a[c]=s.nextInt();
                      for (int c = 0; c<x; c++)
                        {
                          b[c]=a[c];
                        
                        }
       for (int c = 0; c<x; c++)
     System.out.println("Elements of new array:"+b[c]);
    }
}