import java.util.Scanner;

class Dicecup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        if (first > second)
            for (int i = second; i < first + 1; i++)
                System.out.println(i + 1);
        else
            for (int i = first; i < second + 1; i++)
                System.out.println(i + 1);

        sc.close();
    }
}