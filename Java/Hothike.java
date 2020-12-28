import java.util.Scanner;
import java.lang.Math;

class Hothike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] days = new int[n];

        for (int i = 0; i < n; i++)
            days[i] = sc.nextInt();

        int start = 0;
        int hottestHike = Integer.MAX_VALUE;

        for (int i = 2; i < n; i++) {
            if (Math.max(days[i-2], days[i]) < hottestHike) {
                start = i-1;
                hottestHike = Math.max(days[i-2], days[i]);
            }
        }

        System.out.println(start + " " + hottestHike);
        sc.close();
    }
}