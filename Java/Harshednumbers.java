import java.util.Scanner;

class Harshednumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String ns = String.valueOf(n);
        boolean harshard = false;

        while (!harshard) {
            double sum = 0;

            for (int i = 0; i < ns.length(); i++) {
                sum += Character.getNumericValue(ns.charAt(i));
            }

            if (Math.floor(n / sum) == Math.ceil(n / sum)) {
                harshard = true;
            } else {
                n++;
                ns = String.valueOf(n);
            }
        }
        System.out.println(n);
        sc.close();
    }
}