import java.util.Scanner;
import java.util.ArrayList;

class Aboveaverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            ArrayList<Double> scores = new ArrayList<Double>();
            double students = Double.parseDouble(sc.next());
            double total = 0;
            double count = 0;
            
            for (int j = 0; j < students; j++) {
                scores.add(Double.parseDouble(sc.next()));
                total += scores.get(j);
            }

            total /= students;
            for (int j = 0; j < scores.size(); j++)
                if (scores.get(j) > total)
                    count++;

            System.out.printf("%.3f%s", (count / scores.size()) * 100, "%\n");
            sc.close();
        }
    }
}