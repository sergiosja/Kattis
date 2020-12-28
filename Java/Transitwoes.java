import java.util.Scanner;
import java.util.ArrayList;

class Transit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt(); // No use for this
        int classBegins = sc.nextInt();
        int buses = sc.nextInt();
        int total = 0;

        ArrayList<Integer> minutesWalking = new ArrayList<Integer>();
        ArrayList<Integer> minutesOnBus = new ArrayList<Integer>();
        ArrayList<Integer> busIntervals = new ArrayList<Integer>();

        for (int i = 0; i < buses + 1; i++) {
            minutesWalking.add(sc.nextInt());
            total += minutesWalking.get(i);
        }

        for (int i = 0; i < minutesWalking.size() - 1; i++) {
            minutesOnBus.add(sc.nextInt());
            total += minutesOnBus.get(i);
        }

        for (int i = 0; i < minutesOnBus.size(); i++) {
            busIntervals.add(sc.nextInt());
            total += busIntervals.get(i) - minutesWalking.get(i);
        }

        System.out.println(classBegins >= total ? "yes" : "no");
        sc.close();
    }
}