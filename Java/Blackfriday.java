import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

class Blackfriday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<Integer> outcomesFinal = new ArrayList<>();
        ArrayList<Integer> outcomeSet = new ArrayList<>();
        ArrayList<Integer> outcomes = new ArrayList<>();

        for (int i = 0; i < n; i++)
            outcomes.add(sc.nextInt());

        for (int i = 0; i < outcomes.size(); i++)
            outcomeSet.add(outcomes.get(i));

        for (int i = 0; i < outcomes.size(); i++)
            outcomesFinal.add(outcomes.get(i));

        Collections.sort(outcomes);
        for (int i = 1; i < outcomes.size(); i++)
            if (outcomes.get(i) == outcomes.get(i-1)) {
                outcomeSet.remove(Integer.valueOf(outcomes.get(i)));
                outcomeSet.remove(Integer.valueOf(outcomes.get(i-1)));
            }

        if (outcomeSet.isEmpty() == true) {
            System.out.println("none");
        } else {
            int biggest = outcomeSet.get(0);
            for (int i = 1; i < outcomeSet.size(); i++)
                if (outcomeSet.get(i) > biggest)
                    biggest = outcomeSet.get(i);

            System.out.println(outcomesFinal.indexOf(biggest)+1);
        }
        sc.close();
    }
}