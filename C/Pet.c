#include <stdio.h>

int main() {
    int count = 0, finsum = 0;

    for (int i = 1; i < 6; i++) {
        int sum = 0;

        for (int j = 0; j < 4; j++) {
            int n;
            scanf("%d", &n);
            sum += n;

            if (sum > finsum) {
                finsum = sum;
                count = i;
            }
        }
    }
    printf("%d %d\n", count, finsum);
}