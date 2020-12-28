import java.util.Scanner;
import java.lang.Math;

class Ants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            int pole_length = sc.nextInt();
            int ants = sc.nextInt();
            int[] puzzle = new int[ants+1];
            int min = 0, max = 0;

            for (int j = 0; j < ants; j++) {
                puzzle[j] = sc.nextInt();
                min = Math.max(Math.min(puzzle[j], pole_length - puzzle[j]), min);
                max = Math.max(Math.max(puzzle[j], pole_length - puzzle[j]), max);
            }

            System.out.println(min + " " + max);
            sc.close();
        }
    }
}