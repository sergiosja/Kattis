import java.util.Scanner;

class Oddmanout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cases = 0;

        for (int k = 0; k < n; k++) {
            int max = sc.nextInt();
            int current = 0;
            boolean exists = false;
            cases++;

            int[] guests = new int[max+1];
            for (int i = 0; i < max; i++) {
                guests[i] = sc.nextInt();
            }

            for (int i = 0; i < guests.length; i++) {
                current = guests[i];
                exists = false;

                for (int j = 0 ; j < guests.length; j++) {
                    if (current == guests[j] && j != i) {
                        exists = true;
                    }
                }

                if (exists == false) {
                    System.out.println("Case #" + cases + ": " + current);
                    break;
                }
            }
        }
        sc.close();
    }
}