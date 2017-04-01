package HackerRank.Warmup;

import java.util.*;

class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int plus = 0;
        int minus = 0;
        int zero = 0;
        for (int i = 0; i < size; i++) {
            int a = in.nextInt();
            if (a > 0) plus++;
            else if (a < 0) minus ++;
            else zero ++;
        }
        System.out.println((double)plus/size);
        System.out.println((double)minus/size);
        System.out.println((double)zero/size);
    }
}