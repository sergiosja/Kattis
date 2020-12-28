import java.util.Scanner;

class Pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int count = 0;
        int finsum = 0;

        for (int i = 1; i < 6; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += sc.nextInt();
                if (sum > finsum) {
                    finsum = sum;
                    count = i;
                }
            }
        }

        System.out.println(count + " " + finsum);
        sc.close();
    }
}