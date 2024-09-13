import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(-100 <= n && n <= 100) {

            System.out.println(toString(n));
            System.out.println("Good job");
        }
        else {
            System.out.println("Wrong answer");
        }

    }
}