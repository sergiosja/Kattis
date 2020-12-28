import java.util.Scanner;

class Nastyhacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int without = sc.nextInt();
            int with = sc.nextInt();
            int cost = sc.nextInt();

            System.out.println(with - cost > without ? "advertise" :
                               with - cost == without ? "does not matter" :
                               "do not advertise");
        }
        sc.close();
    }
}