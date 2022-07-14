import java.util.Scanner;
public class arm {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
      System.out.println("Enter number:");
         int n,originalNumber, remainder, result = 0;
         n=s.nextInt();
        originalNumber = n;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}