class checking {

    static int numberCount(int[] arr, int x) {

        int frequncy=0;
        for (int i=0; i<arr.length; i++) {

            if(arr[i] == x) {
                frequncy++;
            }
        }

        System.out.println("the number is "+frequncy+" times present in array ");
        return frequncy;
    }

    public static void main(String[] args) {


        int arr[] = {5,2,5,5,2,5};
        int x=5;



        numberCount(arr, x);


    }
}