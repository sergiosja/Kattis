import java.util.Scanner;
import java.util.ArrayList;

class Everywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            ArrayList<String> cities = new ArrayList<String>();
            int trips = sc.nextInt();

            for (int j = 0; j < trips; j++) {
                String city = sc.next();
                if (!cities.contains(city))
                    cities.add(city);
            }
            System.out.println(cities.size());
        }
        sc.close();
    }
}