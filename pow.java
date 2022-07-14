import java.util.*;
class pow
  {
    public static void main(String args[])  
{  
int base, exponent; 
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the base: ");  
base=sc.nextInt();  
System.out.print("Enter the exponent: ");  
exponent=sc.nextInt();
  long result = 1;
    for (; exponent != 0; --exponent) {
      result *= base;
    }
    System.out.println("Answer = " + result);
  }
} 
 