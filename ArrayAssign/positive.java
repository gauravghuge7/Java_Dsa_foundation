class assign {

//    void positiveValue() {
//
//        int number[] = {2, 6, -5, -1, 0, 4, -9};
//
//        for(int i=0; i<number.length; i++) {
//
//            if(number[i] >= 0) {
//                System.out.println(number[i]);
//            }
//        }
//
//    }
//
//    void oddString() {
//
//
//        String [] str={"ab", "bc", "cd", "de", "ef", "fg", "gh"};
//
//        for (int i=0; i< str.length; i++) {
//
//            if(!(i % 2 == 0)) {
//                System.out.println(str[i]);
//            }
//        }
//    }

//    void even() {
//
//        int number[] = {1,2,3,4,5,6,7,8};
//
//        for (int i=0; i<number.length; i++) {
//            if(number[i] % 2 == 0) {
//                System.out.println(number[i]);
//            }
//        }
//
//    }


//    void minimum() {
//        int number[] = {2, -3, 5, 8, 1, 0, -4};
//
//        int mini = 0;
//
//        for (int i=0; i< number.length; i++) {
//
//            mini = Math.min(mini, number[i]);
//
//
//        }
//
//        System.out.println(mini);
//
//    }

    void middle() {
//        int number[] = {1, 1, 3, 4, 2, 3, 5, 7, 0};
//
//        int add[] = new int[3];
//
//        int j=0;
//
//        for (int i=1; i<number.length; i++) {
//
//
//            if((number[i-1] < number[i]) || (number[i] > number[i+1])) {
//
//                add[j] = number[i];
//                j++;
//
//            }
//        }
//        System.out.println(add[1]);

        int []arr={1, 1, 3, 4, 2, 3, 5, 7, 0};
        int []arr2=new int[3];
        int j=0;

        for (int i=1;i<arr.length;i++){

            if ( ( arr[i-1] < arr[i] ) && ( arr[i] > arr[i+1] ) ){
                arr2[j]=arr[i];
                j++;
            }

        }
        System.out.println(arr2[1]);


    }





}



class positive {
    public static void main(String[] args) {

        assign a = new assign();

//        a.positiveValue();

//        a.oddString();

//        a.even();

//        a.minimum();

        a.middle();

    }
}