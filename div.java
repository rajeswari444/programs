import java.util.*;
public class div
  {
	public static void main(String[] args) 
	{
		int x;
		 Scanner sc = new Scanner(System.in);
		System.out.print(" enter x value: ");
		x = sc.nextInt();
		if((x % 5 == 0) && (x % 11 == 0))
		{
			System.out.println("\n Given number " + x + " is Divisible"); 
		}
		else
		{
			System.out.println("\n Given number " + x + " is Not Divisible"); 
		}	
	}
}