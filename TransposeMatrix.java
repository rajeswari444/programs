/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;
public class TransposeMatrix {

     public static void main(String []args)
  {
         Scanner sc=new Scanner(System.in);
         int m,n;                
         
         System.out.println("Enter the number of rows: \n");
         m=sc.nextInt();  
         
         System.out.println("Enter the number of column: \n");
         n=sc.nextInt();  
         int arr[][]=new int[10][10];        
         System.out.println("Enter the elements of the matrix: ");
         for(int i=0;i<m;i++)  
         {
            for(int j=0;j<n;j++)
            {
                 arr[i][j]=sc.nextInt();
            }
         }
         System.out.println("The elements in the original matrix are: ");
         for(int i=0;i<m;i++)    
         {
             for(int j=0;j<n;j++)
             {
                  System.out.print(arr[i][j]+" ");
             }
            System.out.println("");
        }
        
        int brr[][]=new int[10][10];       
        for(int i=0;i<m;i++)     
        {
             for(int j=0;j<n;j++)
             {
                 brr[j][i]=arr[i][j];     
             }
        }
        
        System.out.println("After transposing the elements are...");
        for(int i=0;i<m;i++)      //Print the transpose matrix
        {
             for(int j=0;j<n;j++)
             {
                 System.out.print(brr[i][j]+" ");
             }
            System.out.println("");
        }
         
     }
}
// Good you passed this code and try for optimistic code
