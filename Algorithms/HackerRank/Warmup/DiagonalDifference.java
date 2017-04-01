package HackerRank.Warmup;

import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] matrix = new int[size][size];
        int primary = 0;
        int secondary = 0;
        int a = size-1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = in.nextInt();
                if (i == j) primary += matrix[i][j];
                if (j == a) {
                    secondary += matrix[i][j];
                    a--;
                }
            }
        }
        System.out.print(Math.abs(primary - secondary));
    }
}