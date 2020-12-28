import java.util.Scanner;

class Dicegame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] upper = sc.nextLine().split(" ");
        String[] lower = sc.nextLine().split(" ");
        int g = 0, e = 0;

        for (int i = 0; i < upper.length; i++)
            g += Integer.parseInt(upper[i]);

        for (int i = 0; i < lower.length; i++)
            e += Integer.parseInt(lower[i]);

        System.out.println(g > e ? "Gunnar" : g < e ? "Emma" : "Tie");
        sc.close();
    }
}