import java.util.ArrayList;
import java.util.Scanner;

class ArraysDS {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        ArrayList <Integer> list = new ArrayList<>(a);
        for (int i = 0; i < a; i++) {
            int b = in.nextInt();
            list.add(b);
        }
        for (int i = a; i > 0; i--) {
            System.out.printf("%d ", list.get(i-1));
        }
    }
}