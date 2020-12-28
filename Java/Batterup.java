import java.util.Scanner;

class Batterup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double count = 0;
        double total = 0;

        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            if (j >= 0) {
                count++;
                total += j;
            }
        }
        
        System.out.println(total / count);
        sc.close();
    }
}