import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Plantingtrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList <Integer> init = new ArrayList <Integer> ();
        ArrayList <Integer> updated = new ArrayList <Integer> ();
        int count = 2;
        
        for (int i = 0; i < n; i++)
            init.add(sc.nextInt());

        Collections.sort(init);
        Collections.reverse(init);

        for (int i = 0; i < n; i++) {
            updated.add(init.get(i) + count);
            count++;
        }

        Collections.sort(updated);
        Collections.reverse(updated);

        System.out.println(updated.get(0));
        sc.close();
    }
}