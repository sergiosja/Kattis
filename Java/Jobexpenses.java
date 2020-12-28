import java.util.Scanner;
import java.util.ArrayList;

class Jobexpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList <Integer> expenses = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            if (j < 0)
                expenses.add(j);
        }

        for (int j = 0; j < expenses.size(); j++) {
            int m = expenses.get(j) * (-1);
            expenses.set(j, m);
        }

        int tot = 0;
        for (int j = 0; j < expenses.size(); j++)
            tot += expenses.get(j);

        System.out.println(tot);
        sc.close();
    }
}