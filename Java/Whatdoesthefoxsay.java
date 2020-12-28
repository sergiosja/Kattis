import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Whatdoesthefoxsay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        
        for (int i = 0; i < n; i++) {
            ArrayList <String> check = new ArrayList<String>();
            ArrayList <String> checkSafe = new ArrayList<String>();
            ArrayList <String> foxSays = new ArrayList<String>();

            String[] words = sc.nextLine().split(" ");
            for (int j = 0; j < words.length; j++) {
                check.add(words[j]);
            }

            String[] sounds = new String[100];
            while (sc.hasNextLine() && (!Arrays.asList(sounds).contains("does"))) {
                sounds = sc.nextLine().split(" ");
                checkSafe.add(sounds[2]);
            }

            for (String s : check)
                if (!checkSafe.contains(s))
                    foxSays.add(s);

            String answer = "";
            for (int j = 0; j < foxSays.size(); j++)
                answer += foxSays.get(j) + " ";

            System.out.println(answer.substring(0, answer.length() - 1));
        }
        sc.close();
    }
}