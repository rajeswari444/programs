import java.util.Scanner;
public class evenodd {

 public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int num;
    System.out.println("Enter the number:");
    num=s.nextInt();
    int odd=0,even=0;
    while(num!=0)
    {
        int rem=num%10;
        if(rem%2==1)
            odd++;
        else
            even++;
        num/=10;
    }
    System.out.println("Number of even digits = "+even);
    System.out.println("Number of odd digits = "+odd);
    s.close();
 }
}
