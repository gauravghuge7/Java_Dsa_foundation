

class student {

   int roll_no;
   String name;

   public student() {

   }

   public student(int roll_no, String name) {

      this.name = name;
      this.roll_no = roll_no;
   }
}



public class studentList {
   
   
   public static void main(String[] args) {

      student gaurav = new student();

      gaurav.name = "gaurav ghuge";

      gaurav.roll_no = 15;


      System.out.println(gaurav.name);
      System.out.println(gaurav.roll_no);

   }
}
