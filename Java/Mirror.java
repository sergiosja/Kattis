import java.util.Scanner;
import java.util.ArrayList;
import java.lang.StringBuilder;

class Mirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int count = 0;

        for (int i = 0; i < n; i++) {
            ArrayList<StringBuilder> images = new ArrayList<>();
            int m = sc.nextInt();
            sc.nextInt();  // No need for this
            sc.nextLine(); // And this

            for (int j = 0; j < m; j++) {
                String tmp = sc.nextLine();
                StringBuilder sb = new StringBuilder();
                sb.append(tmp);
                sb = sb.reverse();
                images.add(sb);
            }

            System.out.println("Test " + ++count);
            for (int j = images.size()-1; j >= 0; j--)
                System.out.println(images.get(j));
        }
        sc.close();
    }
}