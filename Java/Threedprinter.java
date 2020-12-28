import java.util.Scanner;

class Threedprinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int statues = sc.nextInt();
        long printers = 1;
        int count = 0;

        if (statues == 1) {
            System.out.println(1);
            System.exit(0);
        }

        while (statues > printers) {
            printers = Math.round(Math.pow(2, count));
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}