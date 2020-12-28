import java.util.Scanner;

class Timeloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        for (int i = 1; i < n; i++)
            System.out.println(i + " Abracadabra");
        sc.close();
    }
}