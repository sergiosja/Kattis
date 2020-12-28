import java.util.Scanner;

class Pauleigon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int serves = sc.nextInt();
        int total = sc.nextInt() + sc.nextInt();

        System.out.println(total / serves % 2 == 0 ? "paul" : "opponent");
        sc.close();
    }
}