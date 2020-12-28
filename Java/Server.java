import java.util.Scanner;

class Server {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxTime = sc.nextInt();
        int total = 0, count = 0;

        for (int i = 0; i < n; i++) {
            total += sc.nextInt();
            count++;

            if (total > maxTime)
                break;
        }

        System.out.println(total > maxTime ? count - 1 : count);
        sc.close();
    }
}