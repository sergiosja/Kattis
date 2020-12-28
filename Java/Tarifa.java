import java.util.Scanner;

class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int n = sc.nextInt();
        int months = n;
        int used = 0;

        for (int i = 0; i < n; i++) {
            used += sc.nextInt();
        }
        System.out.println(max * (months + 1) - used);
        sc.close();
    }
}