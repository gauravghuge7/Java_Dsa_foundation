class dimentions {

    void single() {

        int age[] = {1, 2, 3, 4};

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
    };

    void second() {

        int ages[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };

        System.out.println(ages[0][0]);
        System.out.println(ages[0][1]);
        System.out.println(ages[0][2]);

        System.out.println(ages[1][0]);
        System.out.println(ages[1][1]);
        System.out.println(ages[1][2]);

        System.out.println(ages[2][0]);
        System.out.println(ages[2][1]);
        System.out.println(ages[2][2]);


    }

    void triple() {

        int ages[][][] = {
                {
                        {4,5,6},
                        {7,8,9}
                },
                {
                        {10,20,30},
                        {40,50,60}
                },
                {
                        {100,200,300},
                        {400,500,600}
                }
        };

        System.out.println(ages[0][0][0]);
        System.out.println(ages[0][0][1]);
        System.out.println(ages[0][0][2]);

        System.out.println(ages[0][1][0]);
        System.out.println(ages[0][1][1]);
        System.out.println(ages[0][1][2]);

        System.out.println(ages[1][0][0]);
        System.out.println(ages[1][0][1]);
        System.out.println(ages[1][0][2]);

        System.out.println(ages[1][1][0]);
        System.out.println(ages[1][1][1]);
        System.out.println(ages[1][1][2]);

        System.out.println(ages[2][0][0]);
        System.out.println(ages[2][0][1]);
        System.out.println(ages[2][0][2]);

        System.out.println(ages[2][1][0]);
        System.out.println(ages[2][1][1]);
        System.out.println(ages[2][1][2]);



    }

//    void forth() {
//
//    }



}


class twoDimensional {
    public static void main(String[] args) {

        dimentions d = new dimentions();

        //d.single();

        //d.second();

        d.triple();

    }
}