package day10_ArrayAssign;
class assign {

    void positiveValue() {

        int number[] = {2, 6, -5, -1, 0, 4, -9};

        for(int i=0; i<number.length; i++) {

            if(number[i] >= 0) {
                System.out.println(number[i]);
            }
        }

    }

    void oddString() {


        String [] str={"ab", "bc", "cd", "de", "ef", "fg", "gh"};

        for (int i=0; i< str.length; i++) {

            if(!(i % 2 == 0)) {
                System.out.println(str[i]);
            }
        }
    }

    void even() {

        int number[] = {1,2,3,4,5,6,7,8};

        for (int i=0; i<number.length; i++) {
            if(number[i] % 2 == 0) {
                System.out.println(number[i]);
            }
        }

    }


    void minimum() {
        int number[] = {2, -3, 5, 8, 1, 0, -4};

        int mini = 0;

        for (int i=0; i< number.length; i++) {

            mini = Math.min(mini, number[i]);


        }

        System.out.println(mini);

    }

    void middle() {

        /*  
         *    Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
        Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.
        Leftmost and rightmost element cannot be a peak element.
        Output:
        7
         * 
        */

        int number[] = {1, 1, 3, 4, 2, 3, 5, 7, 0};

        // create a peak element 

        int peak = 0;


        for(int i=1; i<number.length-1; i++) {

            if(number[i-1] < number[i] && number[i] > number[i+1]) {
                peak = Math.max(peak, number[i]);
            }
        }

        System.out.println(peak);

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