package HackerRank;

import java.util.Scanner;

class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int alice = 0;
        int bob = 0;
        int[]compare = {a0 - b0, a1 - b1, a2 - b2};

        for (int aCompare : compare) {
            if (aCompare > 0) alice++;
            else if (aCompare < 0) bob++;
        }

        System.out.printf("%d %d", alice, bob);
    }
}