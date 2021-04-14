#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        int m;
        scanf("%d", &m);
        int votes[m];

        for (int j = 0; j < m; j++)
        {
            int v;
            scanf("%d", &v);
            votes[j] = v;
        }

        int winner = votes[0];
        int winnerIndex = 1;
        for (int j = 1; j < m; j++)
        {
            if (votes[j] > winner) {
                winner = votes[j];
                winnerIndex = j + 1;
            }
        }

        int drawcounter = 0;
        for (int j = 0; j < m; j++)
        {
            if (votes[j] == winner) {
                drawcounter++;
            }
        }

        if (drawcounter > 1) {
            printf("no winner\n");
        }

        else {
            int votecounter = 0;
            for (int j = 0; j < m; j++)
            {
                votecounter += votes[j];
            }
            
            int majorityChecker = votecounter / 2;
            if (winner > majorityChecker) {
                printf("majority winner %d\n", winnerIndex);
            } else {
                printf("minority winner %d\n", winnerIndex);
            }
        }
    }
}