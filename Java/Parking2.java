import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Parking2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int total = 0;

            ArrayList<Integer> stores = new ArrayList<Integer>();
            for (int j = 0; j < num; j++) {
                stores.add(sc.nextInt());
            }
            Collections.sort(stores);

            for (int j = stores.size() - 1; j > 0; j--) {
                total += stores.get(j) - stores.get(j-1);
            }

            System.out.println(total * 2);
        }
        sc.close();
    }
}