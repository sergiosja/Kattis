import java.util.Scanner;

class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int[] votes = new int[m];
            for (int j = 0; j < m; j++)
                votes[j] = sc.nextInt();

            int winner = votes[0];
            int winnerIndex = 1;
            for (int j = 1; j < m; j++)
                if (votes[j] > winner) {
                    winner = votes[j];
                    winnerIndex = j + 1;
                }

            int drawcounter = 0;
            for (int j = 0; j < m; j++)
                if (votes[j] == winner)
                    drawcounter++;

            if (drawcounter > 1)
                System.out.println("no winner");

            else {
                int voteCounter = 0;
                for (int j = 0; j < m; j++)
                    voteCounter += votes[j];

                int majorityChecker = voteCounter / 2;
                System.out.println(winner > majorityChecker ? "majority winner " + winnerIndex :
                                   "minority winner " + winnerIndex);
            }
        }
        sc.close();
    }
}