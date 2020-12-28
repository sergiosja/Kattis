import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = 1;

        try {
            while (sc.hasNextLine()) {
                int casenr = sc.nextInt();
                ArrayList<Integer> stats = new ArrayList<Integer>();
                for (int i = 0; i < casenr; i++)
                    stats.add(sc.nextInt());

                int max = Collections.max(stats);
                int min = Collections.min(stats);

                System.out.println("Case " + cases++ + ": " + min + " " + max + " " + (max - min));
            }
        }
        catch (Exception e) {
            System.exit(0);
        }
        sc.close();
    }
}