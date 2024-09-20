package day08_Methods.AssignMents;


/* 
 * 
 *   @param - Write a Java method to display the middle character of a string.(Easy)
      Note: a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
 * 
*/

public class middleCharacter {
   
   public static void displayMiddleCharacter(String s) {

      int n = s.length();

      if(n % 2 == 0) {
         System.out.println(s.charAt(n / 2));
         System.out.println(s.charAt((n / 2) - 1));
      }
      else {
         System.out.println(s.charAt(n / 2));
      }
   }

   public static void main(String[] args) {

      String s = "Hello World";

      String data = "gaurav";

      displayMiddleCharacter(data);
      
   }

}
