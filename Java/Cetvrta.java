import java.util.Scanner;

class Cetvrta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        
        for (int i = 0; i < 3; i++) {
            x ^= sc.nextInt();
            y ^= sc.nextInt();
        }
        System.out.printf("%d %d\n", x, y);
        sc.close();
    }
}