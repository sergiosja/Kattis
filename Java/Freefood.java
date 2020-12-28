import java.util.Scanner;
import java.util.ArrayList;

class Freefood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<Integer> days = new ArrayList<>();
        ArrayList<Integer> daySet = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int j = start; j < end; j++)
                days.add(start++);

            days.add(end);
            for (int j = 0; j < days.size(); j++)
                if (!daySet.contains(days.get(j)))
                    daySet.add(days.get(j));
        }
        System.out.println(daySet.size());
        sc.close();
    }
}