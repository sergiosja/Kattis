import java.util.Scanner;
import java.lang.Math;

class Sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        double max = Math.floor(Math.sqrt(Math.pow(sc.nextInt(), 2) + Math.pow(sc.nextInt(), 2)));
        for (int i = 0; i < n; i++) {
            System.out.println(sc.nextInt() <= max ? "DA" : "NE");
        }
        sc.close();
    }
}