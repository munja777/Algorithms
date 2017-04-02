import java.util.*;

class RoadsAndLibraries {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for (int a0 = 0; a0 < q; a0++) {

            HashMap<Integer, ArrayList<Integer>> city = new HashMap<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            for (int i = 1; i <= n; i++) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                city.put(i, list);
            }

            for (int a1 = 0; a1 < m; a1++) {
                int x = in.nextInt();
                int y = in.nextInt();
                ArrayList<Integer> list1 = city.get(x);
                ArrayList<Integer> list2 = city.get(y);
                if (list1 != list2) {
                    list1.addAll(list2);
                    list2.forEach(i -> city.put(i, list1));
                }
            }
            if (x < y)
                System.out.println((long) n * x);
            else {
                long cost = 0;
                for (ArrayList<Integer> list : city.values()) {
                    int size = list.size();
                    if (size > 0) {
                        cost += x;
                        cost += (size - 1) * y;
                        list.removeIf(i -> true);
                    }
                }
                System.out.println(cost);
            }
        }
    }
}
