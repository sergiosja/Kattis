import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Quickbrownfox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        char[] pangram = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                          'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                          'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < n; i++) {
            ArrayList<Character> check = new ArrayList<Character>();
            ArrayList<Character> safe = new ArrayList<Character>();

            String sentence = sc.nextLine().trim();
            sentence = sentence.toLowerCase();

            for (int j = 0; j < sentence.length(); j++)
                check.add(sentence.charAt(j));

            Collections.sort(check);
            Collections.sort(safe);

            for (int j = 0; j < pangram.length; j++)
                for (int k = 0; k < check.size(); k++)
                    if (pangram[j] == check.get(k))
                        safe.add(pangram[j]);

            Set<Character> set = new HashSet<Character>();
            set.addAll(safe);

            ArrayList<Character> notPangram = new ArrayList<Character>();
            for (int j = 0; j < pangram.length; j++)
                if (!set.contains(pangram[j]))
                    notPangram.add(pangram[j]);

            if (notPangram.isEmpty()) {
                System.out.println("pangram");
            } else {
                String tbp = "";
                for (int j = 0; j < notPangram.size(); j++)
                    tbp += notPangram.get(j);

                System.out.println("missing " + tbp);
            }
        }
        sc.close();
    }
}