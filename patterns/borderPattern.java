import java.util.Scanner;

class borderPattern {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the rows of the pattern ");
        int r = scan.nextInt();

        System.out.println(" enter the columns of the pattern");
        int c = scan.nextInt();

        for (int i=0; i<r; i++) {

            for (int j=0; j<c; j++) {

                if(i==0 || i==r-1 || j==0 || j==c-1) {

                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}