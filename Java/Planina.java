import java.util.Scanner;

class Planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int side = 2;

        for (int i = 0; i < n; i++)
            side += side - 1;

        System.out.println((int) Math.pow(side, 2));
        sc.close();
    }
}