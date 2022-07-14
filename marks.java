import java.util.*;
    class marks{
      public static void main(String args[]){
        int maths,science,computer,english,telugu,maxmarks,per;
        Scanner s=new Scanner(System.in);
          System.out.println("Enter marks:");
            maths=s.nextInt();
            computer=s.nextInt();
           science=s.nextInt();
           english=s.nextInt();
           telugu=s.nextInt();
            maxmarks=s.nextInt();
        int total=maths+computer+science+english+telugu;
              System.out.println("total marks are: "+total);
         per = ((total / (maxmarks) * 100));
        if(per>90)
             System.out.println("grade O");
         else if(per>80&&per<70)
           System.out.println("grade A");
        else if(per>=70&&per<=60)
           System.out.println("grade B");
        else if(per>=60&&per<=50)
          System.out.println("grade C");
         else if(per>=50&&per<=40) 
           System.out.println("fail");
          }
      
    }
