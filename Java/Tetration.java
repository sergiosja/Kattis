import java.util.Scanner;

class Tetration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double ans = Double.parseDouble(sc.nextLine());
        System.out.println(Math.pow(ans, 1 / ans));
        sc.close();
    }
}