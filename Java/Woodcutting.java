import java.util.Scanner;
import java.util.ArrayList;

class Woodcutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            int customers = sc.nextInt();
            ArrayList<Integer> time = new ArrayList<Integer>();
            
            for (int j = 0; j < customers; j++) {
                int woods = sc.nextInt();
                int total = 0;
                
                for (int k = 0; k < woods; k++)
                    total += sc.nextInt();

                time.add(total);
            }
            
            time.sort((a, b) -> a - b);
            double tmp = 0;
            double sum = 0;
            
            for (double d : time) {
                tmp += d;
                sum = sum + tmp;
            }
            
            System.out.println(sum / customers);
        }
        sc.close();
    }
}