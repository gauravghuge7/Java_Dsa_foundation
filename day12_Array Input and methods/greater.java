import java.util.Scanner;

class greater {

    static int checkGreater(int[] arr, int x) {

        int count=0;
        for (int i=0; i<arr.length; i++) {

            if(arr[1] > x) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println(count);
        return count;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of Array");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter x");
        int x = scan.nextInt();



        checkGreater(arr, x);

    }
}