import java.util.Scanner;
import java.util.ArrayList;

class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        ArrayList<Integer> dups = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int nums = sc.nextInt();
            int ans = nums % 42;
            if (!dups.contains(ans)) {
                dups.add(ans);
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}