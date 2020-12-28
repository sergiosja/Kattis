import java.util.Scanner;

class Shatteredcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = Integer.parseInt(sc.nextLine().trim());
        int n = Integer.parseInt(sc.nextLine().trim());
        int sum = 0;

        for (int i = 0; i < n; i++)
            sum += sc.nextInt() * sc.nextInt();

        System.out.println(sum / width);
        sc.close();
    }
}