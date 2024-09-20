import java.util.Scanner;

class binaryToDecimal {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int binary = s.nextInt();
        int ans = 0;
        int power = 1;

        boolean acceptable_binary = false;
        int unitcheck;

        int new_binary = binary;
        while( new_binary > 0) {


            unitcheck = new_binary % 10;

            acceptable_binary = (unitcheck < 2 && unitcheck > -1);

            new_binary /= 10;

        }

        if(acceptable_binary) {
            while (binary > 0) {

                int unit = binary % 10;
                ans += unit * power;
                binary /= 10;
                power *= 2;
                System.out.println(ans);
            }

        }
        else System.out.println(" invalid binary language ");

        System.out.println(ans);

    }

}