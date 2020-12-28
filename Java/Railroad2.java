import java.util.Scanner;

class Railroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt(); // No use for this
        System.out.println(sc.nextInt() % 2 == 0 ? "possible" : "impossible");
        sc.close();
    }
}