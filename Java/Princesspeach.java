import java.util.Scanner;
import java.util.HashSet;

class Princesspeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        HashSet<Integer> dangers = new HashSet<>();

        for (int i = 0; i < n; i++)
            dangers.add(sc.nextInt());

        for (int i = 0; i < total; i++)
            if (!dangers.contains(i))
                System.out.println(i);

        int m = dangers.size();
        System.out.println("Mario got " + m + " of the dangerous obstacles.");
        sc.close();
    }
}