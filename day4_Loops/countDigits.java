import java.util.*;

class countDigits {
    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//
//        int n = s.nextInt();
//
//        int  numberofDigits = 0;
//
//        while(n>0) {
//
//            n = n / 10;
//            numberofDigits++;
//        }
//
//        System.out.println(" the number of digits is "+numberofDigits);


        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int sum =0;

        while(n>0) {
            sum += n % 10;
            n = n /10;
        }
        System.out.println(sum);
    }
}