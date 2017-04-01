package HackerRank.Implementation;

import java.util.*;

class GradingStudents {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            int mod = grade % 5;
            if (grade >= 38 && mod >= 3) System.out.println(grade + 5 - mod);
            else System.out.println(grade);
        }
    }
}
