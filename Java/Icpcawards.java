import java.util.Scanner;
import java.util.ArrayList;

class Icpcawards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<String> unis = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 12)
                break;
                
            String[] teams = sc.nextLine().split(" ");
            if (!unis.contains(teams[0])) {
                unis.add(teams[0]);
                System.out.println(teams[0] + " " + teams[1]);
                count++;
            }
        }
        sc.close();
    }
}