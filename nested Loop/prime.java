import java.util.Scanner;

class prime {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        boolean prime = false;
        for (int i=2; i<n; i++) {

            prime = n % i == 0;
        }

        if (prime || n == 1 || n == 2) {
            System.out.println(" this is the prime number ");
        }

        else {
            System.out.println(" this is not a prime number");
        }
    }
}