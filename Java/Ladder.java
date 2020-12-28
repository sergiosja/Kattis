import java.util.Scanner;
import java.lang.Math;

class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((int)Math.ceil(sc.nextInt()/Math.sin(Math.toRadians(sc.nextInt()))));
        sc.close();
    }
}