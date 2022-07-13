 //JFM1T4_Assignment3:
   //Write a program to print all the prime numbers between 2 numbers.
   //Prompt the user to enter the 2 numbers.
   
   //Sample Input:
   //Enter starting Number: 20
   //Enter ending Number: 30

import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, i, j, flag;

		System.out.printf("Enter starting number: ");
		a = sc.nextInt(); 
		System.out.printf("Enter ending value: ");
		b = sc.nextInt(); 

		System.out.printf("Prime numbers between %d and %d are: ", a, b);

		for (i = a; i <= b; i++) {
			if (i == 1 || i == 0)
				continue;
			flag = 1;

			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1)
				System.out.println(i);
		}
	}
}
