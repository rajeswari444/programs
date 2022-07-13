/* JFM1T7_Assignment2:

   Create a Student Result Processing System for 3 students.
   
   Sample inputs: Console input roll numbers, names and 5 subject marks for each student
   
   Sample output: Display roll numbers, names and percentage obtained by all 3 students in the following format:
   Roll Number: 1
   Name: Shree Balaji
   Percentage: 99%

*/
import java.util.*;
public class StudentResult
  {

public static void main(String args[])
    {//main method

//initialize student constructor 3 times with different names
      Student1 s1 = new Student1();  
      getStudentInput(s1); 
      Student1 s2 = new Student1();  
      getStudentInput(s2);  
      Student1 s3 = new Student1();  
      getStudentInput(s3);  
     //Create an array and add the 3 student to it  
     Student1[] studentInfo = {s1, s2, s3};  
     displayPercentage(studentInfo);  
 } 
 //create displayPercentage static method in that add a for loop for student array
static void displayPercentage(Student1[] studentArray)
    {  
     
       for(Student1 student:studentArray)   
       { 
       double[] subject = student.getSubject();  
        // calculating percentage  
         double sum = 0;  
         double  percent;  
         for(int i =0 ; i<5 ; i++)
         {  
             sum = sum +subject[i];  
         }  
     //displaying student details  
     System.out.println("nRoll Number : "+student.getRollNo());  
     System.out.println("Name : "+ student.getName());  
     percent = (student.getpercentage()/500)*100;  
     System.out.println("percentage "+Math.round(percent)+ "% \n");  

      } 

}  
//create getStudentInput method in that create a Scanner object and take input from user
   static void getStudentInput(Student1 student)
   {  
         //Createing Scanner object 
         Scanner input = new Scanner(System.in);  
        //Input from user  
         System.out.println("Enter the name : ");  
         student.setName(input.nextLine()); 
         System.out.println("Enter the rollno : ");  
         student.setRollNo(input.nextInt());  
     //printing 5 subject marks using for loop  
         double[] subject = new double[5];  
         double total=0; 
          for(int i=0 ; i<5 ; i++)  
          {  
               System.out.println("Enter the marks of subject : "+(i+1));  
               total=total+ input.nextInt();  
          }  

         student.setPercentage(total);          

     }  
}  
//creating Student class  
class Student1  
{  
          //Declaring and initializing variables  
         int rollNo;  
         double[] subject = new double[5];  
         String name;  
         double percentage;  
         //getter setter methods to be added  
         public void setName(String studentName){ 
          this.name = studentName; 
         } 
         public String getName(){  
            return name; 
          }    
         public void setRollNo(int rollNum){ 
          this.rollNo = rollNum; 
         } 
         public int getRollNo(){  
          return rollNo;  
         }    
         public void setPercentage(double subjectsPercentage){ 
          this.percentage = subjectsPercentage; 
         } 
         public double getpercentage(){  
         return percentage;  
         }  
         public void setSubjects(double[] subjects){ 
         this.subject = subjects; 
         } 
         public double[] getSubject(){  
         return subject;  
         
          }   
         
}
