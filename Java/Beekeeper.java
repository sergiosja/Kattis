import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

        while (sc.hasNextLine()) {
            int n = sc.nextInt();
            if (n == 0) break;
            sc.nextLine();

            String[] words = new String[n];
            int[] scores = new int[n];
            for (int i = 0; i < n; i++) {
                words[i] = sc.nextLine();
            }

            for (int i = 0; i < words.length; i++) {
                int count = 0;
                for (int j = 1; j < words[i].length(); j++)
                    for (int k = 0; k < vowels.length; k++)
                        if (words[i].charAt(j-1) == vowels[k] && words[i].charAt(j) == vowels[k])
                            count++;

                scores[i] = count;
            }

            int winner = scores[0];
            String answer = words[0];
            for (int i = 1; i < scores.length; i++)
                if (scores[i] > winner) {
                    winner = scores[i];
                    answer = words[i];
                }

            System.out.println(answer);
        }
        sc.close();
    }
}