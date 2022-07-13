/*  JFM1T7_Assignment4:

    Write a program to declare a static variable roll_number inside student class. Create 3 student objects and print their names and roll numbers.
    Hint: Use increment operator to get different value of roll_number for 3 students.

   
    Expected Output:
    Roll no:1  Name: Shree 
    Roll no:2  Name: Balaji
    Roll no:3  Name: Ajay
*/

public class StaticVariable 
{
    //main method
    public static void main(String args[])
    {
         StaticVariable obj = new StaticVariable();
        
    }
    //initializing Student class constructor by 3 times and passing 3 student names
    StaticVariable()
    {
      Student s1 = new Student();
		s1.setName("Shree");
		Student s2 = new Student();
		s2.setName("Balaji");
		Student s3 = new Student();
		s3.setName("Ajay");
	
        //displaying student name and roll number
        System.out.println("Roll No : "+(s1.rollno++)+"  Name : "+s1.getName());
    	System.out.println("Roll No : "+(s2.rollno++)+"  Name : "+s2.getName());
    	System.out.println("Roll No : "+(s3.rollno++)+"  Name : "+s3.getName());
    }
}
    //declare Student class andd add declare name, rollno(static)
    class Stu
    {
        
         String name;
		static int rollno=1;
	  
		//add getters and setterss
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public static int getRollno() {
			return rollno;
		}
		public static void setRollno(int rollno) {
			Stu.rollno = rollno;
		}
		
		
	}

