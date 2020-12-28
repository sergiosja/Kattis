import java.util.Scanner;

public class Electricaloutlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int sum = 0;

            for (int j = 0; j < m; j++)
                sum += sc.nextInt();

            sum -= m-1;
            System.out.println(sum);
        }
        sc.close();
    }
}