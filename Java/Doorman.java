import java.util.Scanner;

class Doorman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine().trim());
        String line = sc.nextLine();
        int n = line.length();
        int men = 0, women = 0;

        for (int i = 0; i < n; i++) {
            char ch = line.charAt(i);
            if (ch == 'M')
                men++;
            else
                women++;
            
            if (Math.abs(women - men) >= amount + 2)
                break;
        }

        System.out.println(Math.abs(women - men) >= amount + 2 ? women + men - 2 :
                           Math.abs(women - men) >= amount + 1 ? women + men - 1 :
                           women + men);
        sc.close();
    }
}