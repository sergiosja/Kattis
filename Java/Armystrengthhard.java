import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Armystrengthhard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            int mecha = sc.nextInt();
            int godzilla = sc.nextInt();
            ArrayList<Integer> g_total = new ArrayList<>();
            ArrayList<Integer> m_total = new ArrayList<>();

            for (int j = 0; j < mecha; j++)
                m_total.add(sc.nextInt());

            for (int j = 0; j < godzilla; j++)
                g_total.add(sc.nextInt());

            System.out.println((Collections.max(m_total) >= Collections.max(g_total)) ? "Godzilla" : "MechaGodzilla");
            sc.close();
        }
    }
}