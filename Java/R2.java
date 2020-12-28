import java.util.Scanner;

class R2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        System.out.println(sc.nextInt() * 2 - first);
        sc.close();
    }
}