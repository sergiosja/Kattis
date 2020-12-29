import java.util.Scanner;

class Peasoup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt() +1;
            boolean pea = false;
            boolean pan = false;
            sc.nextLine(); // Whitespace

            String[] menu = new String[m];
            for (int j = 0; j < m; j++)
                menu[j] = sc.nextLine();
            
            for (int j = 1; j < m; j++)
                if (menu[j].equals("pea soup"))
                    pea = true;

            for (int j = 1; j < m; j++)
                if (menu[j].equals("pancakes"))
                    pan = true;

            if (pan == true && pea == true) {
                System.out.println(menu[0]);
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.println("Anywhere is fine I guess");
        sc.close();
    }
}