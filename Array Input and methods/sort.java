import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

class sort {

    static boolean checking(int[] arr) {
//        Arrays.sort(arr);
        boolean check = true;

        for(int i=1; i<arr.length; i++) {

            if(arr[i] < arr[i-1]) {

                check = false;
                break;
            }
        }
        System.out.println(check);

        return check;
    }

    static void printPositive(int[] arr) {



        for (int i=0; i<arr.length; i++) {

            if (arr[i] > 0) {
                System.out.print(arr[i]+" ");
            }

        }

        for(int i=0; i< arr.length; i++) {
            if (arr[i] <= 0) {
                System.out.print(arr[i]+" ");
            }
        }
        return;
    }

    static void unionValue(int[] arr1, int[] arr2) {

        for (int i=0; i< arr1.length; i++) {
            for (int j=0; j< arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }

    }


    static void thirdSmallest(int[] arr, int k) {

        Arrays.sort(arr);

        System.out.println(arr[k-1]);

    }

    static void equalArr(int[] arr1, int[] arr2) {

        boolean check = (arr1 == arr2);

        if(check) {
            System.out.println(check);
        }
        else {
            System.out.println(check);
        }


//        boolean check = true;
//        boolean check1 = false;
//
//
//        for (int i=0; i<arr1.length; i++) {
//
//            for (int j=0; j<arr1.length; j++) {
//
//                check1 = (arr1[i] == arr2[j]);
//
//            }
//
//            if(check1) {
//
//                System.out.println(check);
//
//            }
//            else {
//                System.out.println("false");
//                break;
//            }
//
//        }



    }



    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter size of Array");
//        int n = scan.nextInt();
//
//        int[] arr = new int[n];
//
//        for (int i=0; i<arr.length; i++) {
//            arr[i] = scan.nextInt();
//        }

//        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
//        int arr1[] = {15,8,5, 11};

        int arr[] = {12,45,18,98,43,87,67, 7};
        int a[] = {12,45,18,98,43,87,67, 7};
//        checking(arr);

//        printPositive(arr);

//        unionValue(arr, arr1);

//          thirdSmallest(arr, a);


//        equalArr(arr, a);

        if(arr == a) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}