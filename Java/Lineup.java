import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Lineup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine().trim());
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < amount; i++)
            names.add(sc.nextLine());

        ArrayList<String> sorted = new ArrayList<>();
        for (int i = 0; i < amount; i++)
            sorted.add(names.get(i));

        Collections.sort(sorted);
        ArrayList<String> reversed = new ArrayList<>();
        for (int i = 0; i < amount; i++)
            reversed.add(names.get(i));

        Collections.sort(reversed, Collections.reverseOrder());
        System.out.println(names.equals(sorted) ? "INCREASING" : names.equals(reversed) ? "DECREASING" : "NEITHER");
        sc.close();
    }
}