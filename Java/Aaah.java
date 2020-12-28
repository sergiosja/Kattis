import java.util.Scanner;

class Aaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().length() < sc.nextLine().length() ? "no" : "go");
        sc.close();
    }
}