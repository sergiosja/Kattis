import java.util.Scanner;
import java.lang.Math;

class Pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            int first = Integer.parseInt(line.substring(0, line.length() - 1));
            int pot = Integer.parseInt(line.substring(line.length() - 1));
            total += Math.pow(first, pot);
        }
        
        System.out.println(total);
        sc.close();
    }
}