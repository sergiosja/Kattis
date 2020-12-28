import java.util.Scanner;

class Chanukah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int days = sc.nextInt();
            int total = 0;

            for (int j = 1; j < days+1; j++)
                total += j;

            System.out.println(num + " " + (total + days));
        }
        sc.close();
    }
}