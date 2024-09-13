import java.util.Scanner;

class numericalRectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the rows of the pattern ");
        int r = scan.nextInt();

        System.out.println(" enter the columns of the pattern");
        int c = scan.nextInt();

        for (int i=1; i<=r; i++) {

            for (int j=i; j<=c; j++) {


                System.out.print(j);

            }

            for (int k=1; k<=i-1; k++) {
                System.out.print(k);
            }



            System.out.println();
        }
    }
}