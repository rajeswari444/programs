/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/

import java.util.Scanner;
public class ReverseString {
public static void main(String args[])
  {   
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string:");
     String s=sc.nextLine();
      String reverse = "";
 for(int i = s.length() - 1; i >= 0; i--)
 {
 reverse = reverse + s.charAt(i);
 }
 System.out.println("Reversed string is:"+reverse);
       
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter second string : ");
 
    String s2= scanner.nextLine();
    scanner.close();
 
    String words[] = s2.split("\\s");
    String reversedString = "";
 
    for (int i = 0; i < words.length; i++) 
    {
      String word = words[i];
      String reverseWord = "";
      for (int j = word.length() - 1; j >= 0; j--) {
        reverseWord = reverseWord + word.charAt(j);
      }
      reversedString = reversedString + reverseWord + " ";
    }
 
    // Displaying the string after reverse
    System.out.print("Reversed string : " + reversedString);
  }
}

//declare variables and take input from user

//creat stringbuffer object for string reversing

//reverse input string

//print entire string result

//call reverWordInMyString method

/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/


/* 
   Use charAt() function returns the character
   at the given position in a string
*/

//print reverse each word string result
