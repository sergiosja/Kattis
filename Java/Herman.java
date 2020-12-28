import java.util.Scanner;
import java.lang.Math;

class Herman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double euc = r*r*Math.PI;
        double taxicab = Math.pow(r, 2) + Math.pow(r, 2);

        System.out.println(euc + "\n" + taxicab);
        sc.close();
    }
}