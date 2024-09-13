import java.util.Scanner;

class DtoB {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int decimal = s.nextInt();

        int new_decimal = decimal;

        int power = 1;
        int ans =0;

        while (decimal > 0 ) {
            int unit = decimal % 2;

            ans += unit * power;

            power *= 10;

            decimal /= 2;

        }

        System.out.println(ans);
    }
}