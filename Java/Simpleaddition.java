import java.util.Scanner;

class Simpleaddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextBigInteger().add(sc.nextBigInteger()));
        sc.close();
    }
}