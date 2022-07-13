/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithInbuilt {
public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter the string:");
     String a=sc.nextLine();
      System.out.println("enter the search string:");
    String b=sc.nextLine();
    if(a.contains(b))
    {
    System.out.println("Is found");
    }
    else
      System.out.println("Is not found");
  }
//main method

//declare variables

//take input from user

//check if the string contains substring or not if contains print found else print not found

}