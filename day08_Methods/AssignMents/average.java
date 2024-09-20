package day08_Methods.AssignMents;


/*   
 *    Write a Java method to compute the average of three numbers
*/
public class average {

   public int getAverage(int a, int b, int c) {

      return (a+b+c) / 3;

   }

   void main(String[] args) {
      
      int a = 10;
      int b = 20;
      int c = 30;
      
      
      System.out.println(getAverage(a, b, c));

   }
   
}
