package HackerRank.Algorithms.Warmup;

import java.util.*;

class AVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        long sum = 0;
        for (int i = 0; i < size; i++) {
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}