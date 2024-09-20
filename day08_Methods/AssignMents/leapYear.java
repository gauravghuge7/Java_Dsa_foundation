

package day08_Methods.AssignMents;

/**
 * leapYear
*/


/* 
 *    - Write a Java method to check whether a year (integer) entered by the user is a leap year
or not.
 * 
*/

public class leapYear {

   public static boolean isLeapYear(int year) {

      if(year % 4 == 0) {
         if(year % 100 == 0) {
            if(year % 400 == 0) {
               return true;
            }
            else {
               return false;
            }
         }
         else {
            return true;
         }
      }
      
      else {
         return false;
      }

   }

   public static void main(String[] args) {
      
      // int year = 2000;
      int year = 1900;

      System.out.println(isLeapYear(year));;
   }

   

}