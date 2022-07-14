import java.util.Scanner;
public class even
  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = s.nextInt();
        if(x % 2 == 0)
            System.out.println(x + " is even");
        else
            System.out.println(x + " is odd");
    }
}