import java.util.Scanner;

class Twostones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() % 2 == 0 ? "Bob" : "Alice");
        sc.close();
    }
}