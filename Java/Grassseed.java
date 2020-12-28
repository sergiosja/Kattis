import java.util.Scanner;

class Grassseed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cost = sc.nextDouble();
        double total = 0.000000;
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double first = sc.nextDouble();
            double second = sc.nextDouble();
            total += first * second;
        }
        System.out.println(total * cost);
        sc.close();
    }
}