import java.util.Scanner;

class Zanzibar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String[] tmp = sc.nextLine().split(" ");
            int[] turtles = new int[tmp.length +1];

            for (int j = 0; j < tmp.length-1; j++)
                turtles[i] = (Integer.parseInt(tmp[j]));

            int total = 0;
            for (int j = 1; j < turtles.length; j++) {
                if ((turtles[j-1] * 2) < turtles[j]) {
                    int first = turtles[j-1] * 2;
                    int second = turtles[j];
                    total += second - first;
                }
            }
            System.out.println(total);
        }
        sc.close();
    }
}