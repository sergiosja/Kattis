import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Bookingaroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount1 = sc.nextInt();
        ArrayList<Integer> rooms = new ArrayList<Integer>();
        for (int i = 1; i < amount1 +1; i++)
            rooms.add(i);

        int amount2 = sc.nextInt();
        if (amount2 == 0) {
            System.out.println(1);
        }
        else {
            ArrayList<Integer> bookings = new ArrayList<Integer>();
            for (int i = 1; i < amount2 +1; i++)
                bookings.add(sc.nextInt());

            Collections.sort(rooms);
            Collections.sort(bookings);

            if (rooms.size() <= bookings.size()) {
                System.out.println("too late\n");
            }
            else {
                int count = 1;
                while (bookings.contains(rooms.get(count)))
                    count++;
                System.out.println(rooms.get(count));
            }
        }
        sc.close();
    }
}
