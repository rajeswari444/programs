import java.util.*;
class EvenOdd
  {
    public static void main(String args[])
    {
         int x,counteven=0,countodd=0;
    Scanner s=new Scanner(System.in);
    System.out.println("enbter array size:");
    x=s.nextInt();
    int arr[]=new int[x];
    System.out.println("enter values in an array");
         for(int a=0;a<x;a++)
                 arr[a]=s.nextInt();
      for(int a=0;a<x;a++)
             {
                if (arr[a]%2==0)
                  {
                      counteven++;
                        }
                 else
                 {
                      countodd++;
    }
             }
               System.out.println("even numbers are:"+counteven);
               System.out.println("odd numbers are:"+countodd);
    }
  }