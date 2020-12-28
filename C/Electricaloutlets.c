#include <stdio.h>
#include <string.h>

int main () {
    int amount;
    scanf("%d", &amount);

    for (int i = 0; i < amount; i++) {
        int n, sum;
        scanf("%d", &n);
        sum = 0;

        for (int j = 0; j < n; j++) {
            int x;
            scanf("%d", &x);
            sum += x;
        }

        sum -= n-1;
        printf("%d\n", sum);
    }
}