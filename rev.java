import java.io.*;
import java.util.Scanner;
public class rev   
{  
public static void main(String[] args)   
{  
  Scanner s=new Scanner(System.in);
  int number=s.nextint(); 
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  