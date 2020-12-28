import java.util.Scanner;

class Areal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ans = Double.parseDouble(sc.nextLine());
        System.out.printf("%.21f", Math.sqrt(ans) * 4);
        sc.close();
    }
}