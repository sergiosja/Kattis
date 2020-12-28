import java.util.Scanner;

class Lastfactorialdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int j = sc.nextInt() + 1;
            int tmp = 1;

            for (int k = 1; k < j; k++) {
                total = tmp * k;
                tmp = total;
            }

            String sum = total + "";
            System.out.println(sum.substring(sum.length() - 1));
        }
        sc.close();
    }
}