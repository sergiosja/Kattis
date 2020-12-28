import java.util.Scanner;
import java.util.ArrayList;

class Acm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wrongs = new ArrayList<>();
        ArrayList<Character> rights = new ArrayList<>();
        int total = 0;
        int correct = 0;

        while (sc.hasNextLine()) {
            int min = sc.nextInt();
            if (min < 0) break;
            char task = sc.next().charAt(0);
            String bool = sc.next();

            if (bool.equals("wrong"))
                wrongs.add(task);
            
            if (bool.equals("right")) {
                if (!rights.contains(task)) {
                    rights.add(task);
                    correct++;
                    total += min;
                    for (char t : wrongs)
                        if (t == task)
                            total += 20;
                }
            }
        }
        System.out.println(correct + " " + total);
        sc.close();
    }
}