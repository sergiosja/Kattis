import java.util.Scanner;

class Countingclauses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() >= 8 ? "satisfactory" : "unsatisfactory");
        sc.close();
    }
}