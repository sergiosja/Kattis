import java.util.Scanner;

class Soylent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            int calories = sc.nextInt() + 399;
            int bottles = calories / 400;
            System.out.println(bottles);
        }
        sc.close();
    }
}