import java.util.*;

public class notes{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter amount.....");
    int amount=sc.nextInt();
    while(amount>0){
      if(amount>=2000){
        System.out.println("no of 2000 notes: "+(amount/2000));
        amount=amount % 2000;
      }
      else if(amount>=500){
        System.out.println("no of 500 notes: "+(amount/500));
        amount=amount % 500;
      }
      else if(amount>=200){
        System.out.println("no of 200 notes: "+(amount/200));
        amount=amount % 200;
      }
      else if(amount>=100){
        System.out.println("no of 100 notes: "+(amount/100));
        amount=amount % 100;
      }
      else if(amount>=50){
        System.out.println("no of 50 notes: "+(amount/50));
        amount=amount % 50;
      }
      else if(amount>=20){
        System.out.println("no of 20 notes: "+(amount/20));
        amount=amount % 20;
      }
      else if(amount>=10){
        System.out.println("no of 10 notes: "+(amount/10));
        amount=amount % 10;
      }
      else{
        System.out.println("not valid amount");
      }
    }
  }
}