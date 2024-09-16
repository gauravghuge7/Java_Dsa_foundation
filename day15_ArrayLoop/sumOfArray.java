class addition {

    void sum() {

        int ages[] = {1,2,3,4,5};
        int sum =0;
        for(int i=0; i<ages.length; i++) {

            sum += ages[i];

        }

        System.out.println(sum);
    }

    void highest() {

        int ages[] = {1,2,3,4,25,12};
        int high = -1;
        for (int i=0; i<ages.length; i++) {
            if (ages[i] > high) {

                high = ages[i];

            }

        }

        System.out.println(high);
    }

    void find() {

        int ages[] = {1,2,3,4,25,12};

        int find = 4;
        boolean findNum = false;

        for (int i=0; i<ages.length; i++) {

            findNum = ages[i] == find;

            if(findNum) {

                System.out.println(" found the number on index "+i);
                break;
            }

        }

        if(!findNum) {
            System.out.println(" number is not found in array");
        }



    }



}




class sumOfArray {
    public static void main(String[] args) {

        addition a = new addition();

//        a.sum();
//        a.highest();
        a.find();

    }
}