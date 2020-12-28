import java.util.Scanner;

class Anothercandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            int max = sc.nextInt();
            int total = 0;
            for (int j = 0; j < max; j++)
                total += sc.nextLong() % max;

            total %= max;
            System.out.println(total == 0 ? "YES" : "NO");
        }
        sc.close();
    }
}