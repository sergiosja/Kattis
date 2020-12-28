import java.util.Scanner;

class Rijeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim()) -1;
        int a = 0, b = 1, x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            x = a;
            y = b;
            
            b += x;
            a = y;
        }
        System.out.println(a + " " + b);
        sc.close();
    }
}