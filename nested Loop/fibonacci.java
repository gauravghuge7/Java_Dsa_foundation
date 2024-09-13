
import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int fibo = 0;
        int a=0,b=1;

        for (int i=1; i<n; i++) {

            fibo = a + b;
            System.out.print(fibo);
            a = b;


            System.out.print(" "+a+" ");
            b = fibo;
            System.out.print(b);


            System.out.println("the series is the "+a);
        }
    }
}

