/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class HighestNumber {
     
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
 int x=sc.nextInt();
 int y=sc.nextInt();
 int z=sc.nextInt();  
if(x>y && x>z){
  System.out.println(x+" is the highest number");
}
  else if(y>x && y>z){
    System.out.println(y+" is the highest number");
    }
  else{
    System.out.println(z+" is the highest number");
  }
}
}