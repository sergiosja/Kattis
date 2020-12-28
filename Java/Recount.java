import java.util.Scanner;
import java.util.HashMap;

class Recount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <String, Integer> count = new HashMap<>();
        String winner = "";
        int max = 0;

        while (sc.hasNextLine()) {
            String name = sc.nextLine();
            if (name.equals("***")) break;

            if (!count.containsKey(name)) {
                int votes = 1;
                count.put(name, votes);
                
                if (votes > max) {
                    max = votes;
                    winner = name;
                } else if (votes == max) {
                    winner = "Runoff!";
                }
            } else {
                int votes = count.get(name);
                count.put(name, votes+1);

                if (votes > max) {
                    max = votes;
                    winner = name;
                } else if (votes == max) {
                    winner = "Runoff!";
                }
            }
        }
        System.out.println(winner);
        sc.close();
    }
}