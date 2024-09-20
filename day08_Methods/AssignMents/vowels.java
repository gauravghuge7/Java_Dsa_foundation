package day08_Methods.AssignMents;

/*   

   Write a Java method to count all vowels in a string


*/


public class vowels {


   public static int countVowels(String s) {


      int count = 0;

      int n = s.length();

      for(int i=0; i<n; i++) {

         char ch = s.charAt(i);

         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            count++;
         }


      }


      return count;

   }
   public static void main(String[] args) {
      
      String s = "Hello World";
      String s2 = "abcdefghijklmnopqrstuvwxyz";

      String s3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

      // System.out.println(countVowels(s));
      // System.out.println(countVowels(s2));
      System.out.println(countVowels(s3));

   }
   
}
