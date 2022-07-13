/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/
public class DiamondPattern {

    public static void main(String[] args) {
      int c = 0;
      while ( c != 2){
        if (c ==1 ) {
          System.out.print("c ");
        }
        if (c==0) {
          for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 2; i++) {
              System.out.print("a ");
            }
            System.out.print("b ");
          }
        } else {
          for (int j = 0; j < 2; j++) {
            System.out.print("b ");
            for (int i = 0; i < 2; i++) {
              System.out.print("a ");
            }
          }
        }
        c++;
      }
    }
}