import java.util.Scanner;  
public class sum   
{  
public static void main(String args[])  
{  
int num, dig, sum = 0;  
Scanner s = new Scanner(System.in);  
System.out.print("Enter the number: ");  
num = s.nextInt();  
while(num > 0)  
{    
dig = num % 10;  
sum = sum + dig;  
num = num / 10;  
}    
System.out.println("Sum of Dig: "+sum);  
}  
}  


