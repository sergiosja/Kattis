import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Shopaholic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList <Long> products = new ArrayList<>();
        long discount = 0;
        
        for (int i = 0; i < n; i++)
            products.add(sc.nextLong());

        Collections.sort(products);
        Collections.reverse(products);

        if (n < 3) {
            System.out.println(0);
        } else {
            for (int i = 2; i < n; i+=3)
                discount += products.get(i);

            System.out.println(discount);
        }
        sc.close();
    }
}