import java.util.Scanner; 
public class fact {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter a numb : ");
        int number = s.nextInt();
    System.out.print("Factors of " + number + " are: ");
    for (int i = 1; i <= number; ++i) {
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}