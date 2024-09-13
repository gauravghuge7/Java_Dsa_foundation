class program {
    void sum( int a, int b) {
        int sum = a * b;
        System.out.println(sum);


    }

    void mul(int a, int b) {
        int mul = a * b;
        System.out.println(mul);
    }

}


public class operations {
    public static void main(String[] args) {

    program p = new program();

    p.sum(13,15);
    p.mul(10, 20);
    }
}