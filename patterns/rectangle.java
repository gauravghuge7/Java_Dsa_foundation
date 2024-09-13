import java.util.Scanner;

class rectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the rows of the pattern ");
        int r = scan.nextInt();

        System.out.println(" enter the columns of the pattern");
        int c = scan.nextInt();

        for (int i=1; i<=r; i++) {

            for(int j=1; j<=c; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}