/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
public class Operations {

public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=a*b;
   System.out.println("product of two numbers:"+ c);
  int d=sc.nextInt();
  int e=sc.nextInt();
  int f=a/b;
   System.out.println("Divison of two numbers:"+ f);
  int x=sc.nextInt();
  int y=++x;
  int z=--x;
  System.out.println("Increment and Decrement the number:"+y+ +z);
  int g=sc.nextInt();
  int h=sc.nextInt();
  int i=a%b;
  System.out.println(" Remainder of 2 numbers:"+ i);
  int k=sc.nextInt();
  int l=sc.nextInt();
  int m=a-b;
   System.out.println("difference  between two numbers:"+ m);
}
}