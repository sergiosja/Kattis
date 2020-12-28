import java.util.Scanner;

class Qaly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n; i++)
            total += Double.parseDouble(sc.next()) * Double.parseDouble(sc.next());

        System.out.printf("%.3f", total);
        sc.close();
    }
}