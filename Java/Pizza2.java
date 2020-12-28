import java.util.Scanner;
import java.lang.Math;

class Pizza2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pizza = Double.parseDouble(sc.next());
        double crust = Double.parseDouble(sc.next());

        double radius = pizza * pizza * Math.PI * 100;
        double amount = (pizza - crust) * (pizza - crust) * Math.PI;

        System.out.printf("%.6f", ((amount/radius)*10000));
        sc.close();
    }
}