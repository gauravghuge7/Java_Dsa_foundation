
class number {

    void printThroughNumber() {

        int ages[] = {1,2,3,4,5};

//        for(int i=0; i<5; i++) {
//
//            System.out.println(ages[i]);
//        }

        for(int age:ages) {
            System.out.println(age);
        }
    }
}

class numberPrint {
    public static void main(String[] args) {

        number n = new number();

        n.printThroughNumber();

    }
}