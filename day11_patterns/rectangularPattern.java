import java.util.Scanner;

class rectangularPattern {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" enter the rows of pattern");
        int r = scan.nextInt();

        System.out.println("enter the column of patterns");
        int c = scan.nextInt();

        for (int i=0; i<r; i++) {

            for (int j=0; j<c; j++ ) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}