package day08_Methods.AssignMents;

/* 
 * 
 *   - Write a Java method to check whether a year (integer) entered by the user is a leap year
or not.
 * 
*/



public class minimumNumber {
   
   public static int getMinimumNumber(int a, int b, int c) {

      // first approach 

      // if(a < b && a < c) {
      //    return a;
      // }
      // else if(b < a && b < c) {
      //    return b;
      // }
      // else {
      //    return c;
      // }
   
      // second approach

      int min = Math.min(a, Math.min(b, c));
      
      return min;
   }

   public static void main(String[] args) {
      
      int a = 10;
      int b = 20;
      int c = 30;

      System.out.println(getMinimumNumber(a, b, c));
   }

}
