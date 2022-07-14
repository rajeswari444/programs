import java.io.*;
import java.util.Scanner;

public class 123{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double G_Salary, Basic, HRA, DA; 
        System.out.print("Enter basic salary of employee : "); 
        Basic = sc.nextDouble();
if (Basic<=10000){
        HRA = (20*Basic)/100; // HRA = 20% OF BASIC SALARY
        DA = (80*Basic)/100;  // DA = 80% OF BASIC SALARY
}
else if(Basic <=20000){
        HRA = (25*Basic)/100; // HRA = 25% OF BASIC SALARY
        DA = (90*Basic)/100;  // DA = 90% OF BASIC SALARY
}
else{
 HRA = (30*Basic)/100; // HRA = 30% OF BASIC SALARY
        DA = (95*Basic)/100;  // DA = 95% OF BASIC SALARY
}
        G_Salary = Basic+HRA+DA; //Gross Salary = Basic Salary + House Rent allowance(HRA) + Dearness Allowance(DA)
        System.out.println("The Gross salary of the employee will be : "+G_Salary+" Rupees");
    }
}