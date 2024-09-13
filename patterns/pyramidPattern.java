import java.util.Scanner;

class pyramidPattern {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the rows of the pattern ");
        int r = scan.nextInt();

        System.out.println(" enter the columns of the pattern");
        int c = scan.nextInt();

        for (int i=0; i<r; i++) {

            for (int j=0; j< r-i; j++) {

                System.out.print(" ");
            }

            for (int k=0; k< 2*i-1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}