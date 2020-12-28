import java.util.Scanner;

class Numberfun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            double a = Double.parseDouble(sc.next());
            double b = Double.parseDouble(sc.next());
            double c = Double.parseDouble(sc.next());

            System.out.println(a + b == c || a - b == c || b - a == c || a * b == c ||
                               a / b == c || b / a == c ? "Possible" : "Impossible");
        }
        sc.close();
    }
}