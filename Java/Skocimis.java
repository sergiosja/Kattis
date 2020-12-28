import java.util.Scanner;
import java.lang.Math;

class Skocimis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int one = Math.abs(first - second);
        int two = Math.abs(second - third);

        int biggest = one;
        if (two > biggest)
            biggest = two;

        System.out.println(biggest-1);
        sc.close();
    }
}