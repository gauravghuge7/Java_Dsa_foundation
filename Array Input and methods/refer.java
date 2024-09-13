class demo {

    static void ArrayPrint(int[] arr) {

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void changeArrayToZero(int[] arr) {

        for (int i=0; i<arr.length; i++) {

            arr[i] =0;
        }
    }

    void arrM() {

        int arr[] = {1,2,3,4,5};

        System.out.println(" original array");
        ArrayPrint(arr);

        int arr_2[] = arr;

        System.out.println("print array copy before changing");
        ArrayPrint(arr_2);

        System.out.println("print array after changing values ");
        changeArrayToZero(arr_2);
        ArrayPrint(arr_2);

        System.out.println("print original array in arr1");
        ArrayPrint(arr);




    }


}





class refer {
    public static void main(String[] args) {

        demo d = new demo();
        d.arrM();

    }
}