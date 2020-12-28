import java.util.Scanner;
import java.util.ArrayList;

class Licensetolaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int total = 0;

        ArrayList<Integer> days = new ArrayList<>();
        for (int i = 0; i < amount; i++)
            days.add(sc.nextInt());

        for (int i = 1; i < days.size(); i++)
            if (days.get(total) > days.get(i))
                total = days.indexOf(days.get(i));

        System.out.println("\n" + total);
        sc.close();
    }
}