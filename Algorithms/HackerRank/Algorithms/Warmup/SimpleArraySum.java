package HackerRank.Algorithms.Warmup;

import java.util.*;

class SimpleArraySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int sum = 0;
        for (int i=0; i<a; i++) {
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}