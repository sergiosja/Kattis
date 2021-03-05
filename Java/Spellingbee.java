import java.util.Scanner;

class Spellingbee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String puzzle = sc.nextLine();
        String centre = puzzle.charAt(0) + "";
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            
            boolean containsC = false;
            if (word.length() >= 4 && word.contains(centre)) {
                containsC = true;
            }

            int counter = 0;
            for (int j = 0; j < word.length(); j++) {
                String c = word.charAt(j) + "";
                if (puzzle.contains(c)) {
                    counter++;
                }
            }

            if (containsC && counter == word.length()) {
                System.out.println(word);
            }
        }
        sc.close();
    }
}