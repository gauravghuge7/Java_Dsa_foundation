class Array1 {

    void initArray() {

        int ages[] = new int[3];

        ages[0] = 7;
        ages[1] = 14;
        ages[2] = 16;


        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);



    }

    void litArray() {
        int[] ages = {1, 2, 3, 4, 5};

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);
    }
}





class demoArray {
    public static void main(String[] args) {
        Array1 a = new Array1();
//        a.initArray();

          a.litArray();

    }
}