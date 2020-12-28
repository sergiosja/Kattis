import java.util.Scanner;

class DeathKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int tmp = n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            String record = sc.nextLine();
            for (int j = 1; j < record.length(); j++)
                if (record.charAt(j-1) == 'C' && record.charAt(j) == 'D')
                    count++;
        }
        System.out.println(tmp - count);
        sc.close();
    }
}