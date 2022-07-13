/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.Scanner;
public class ArraySum
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
  
    //Declare the variables and initialize
    int arr[]=new int[10];
    int sum=0;


    System.out.println("enter the 10 elements");
    for(int i=0;i<10;i++)
      {
         arr[i]=sc.nextInt();//Take input from user
      }
    for(int i=0;i<10;i++) //Check user input values using for loop and add all values
      {
        sum=sum+arr[i];
      }
    System.out.println("sum"+sum);//Print the result

    
}
}

//Good Job
//please maintain proper comments in your code
