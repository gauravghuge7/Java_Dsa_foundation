class display {

    void length() {

        int ages[] = {2,3,4,5,6,7};

        for(int i=0; i<ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}


class length {
    public static void main(String[] args) {
        display d = new display();

        d.length();
    }
}