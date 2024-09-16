import java.util.Arrays;
import java.util.Scanner;

class arrayInput {
    public static void main(String[] args) {

        System.out.println("Enter Size of Array");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++) {

            arr[i] = scan.nextInt();
        }

        for(int i=0; i<arr.length; i++) {

            System.out.println(arr[i]);
        }





    }
}